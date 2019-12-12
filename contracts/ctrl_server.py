# WEB
from flask import Flask, make_response, request, render_template
import json

# ETH
from hexbytes import HexBytes
from eth_account.messages import encode_defunct
import brownie.project as project
from brownie import network, web3
from brownie.network import accounts

class ControlServer(object):
    def __init__(self, eth_network, token_addr):
        p = project.load()
        p.load_config()
        network.connect(eth_network)
        self.token = p.Token.at(token_addr)

        with open("keys/keys.json", "r") as keyfile:
            keys = json.load(keyfile)
            for pair in keys:
                # print (pair)
                accounts.add(pair['sk'])
                # print (pair['pk'])

    def _sign_message(self, token_id):
        message = encode_defunct(text=str(token_id))
        private_key = accounts[0].private_key
        signed_message = web3.eth.account.sign_message(message, private_key=private_key)

        return signed_message.signature

    def verify_signature(self, token_id, signature):
        try:
            message = encode_defunct(text=str(token_id))
            res = web3.eth.account.recover_message(message, signature=signature)
            pk = self.token.ownerOf(token_id)
        except:
            return False

        return pk == res

    def burn(self, token_id):
        self.token.burn(token_id, {"from": accounts[0]} )

    def make_web_controller(self):
        ctrl_srv = Flask("controll-server", template_folder='templates')

        def set_header(resp):
            resp.headers['content-type'] = 'application/json'

            return resp

        @ctrl_srv.after_request
        def after_request(response):
            response.headers.add('Access-Control-Allow-Origin', '*')
            response.headers.add('Access-Control-Allow-Headers', 'Content-Type,Authorization')
            response.headers.add('Access-Control-Allow-Methods', 'GET,POST')
            return response

        @ctrl_srv.route('/sign/<token_id>', methods=['GET'])
        def get_signature(token_id):
            req = request.json
            sign = self._sign_message(int(token_id))
            # res = self.verify_signature(int(req['token_id']), sign)
            resp = make_response(json.dumps({ 'signature' :  sign.hex() }))

            # if res:
            # self.burn(int(req['token_id']))

            return set_header(resp)

        @ctrl_srv.route('/verify', methods=['POST'])
        def verify_signature():
            req = request.json
            sign = HexBytes(req['signature'])
            res = self.verify_signature(int(req['token_id']), sign)

            # if res:
            #     self.burn(int(req['token_id']))

            resp = make_response(json.dumps({ 'valid' :  res }))

            return set_header(resp)

        @ctrl_srv.route('/exist/<token_id>', methods=['GET'])
        def is_exist(token_id):
            status = self.token.exists(int(token_id))
            # res = self.verify_signature(int(req['token_id']), sign)
            resp = make_response(json.dumps({ 'status' : status }))

            return set_header(resp)

        @ctrl_srv.route('/', methods=['GET'])
        def home():
            return render_template('index.html')
        

        return ctrl_srv

if __name__ == "__main__":
    token_addr = '0xB1E0472C4027c1a929b8ba4DD50F21D61c6B54d3'
    ctrl_server = ControlServer('rinkeby', token_addr)
    signature = ctrl_server._sign_message(11)
    print (signature.hex())
    ref = ctrl_server.verify_signature(11, signature)
    # print (ref)
    web_controller = ctrl_server.make_web_controller()
    web_controller.run(port=10001)