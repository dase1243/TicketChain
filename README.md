# TicketChain


## It's a monorepo for Android and Web apps, Smart Contracts and other utils.
Read more detailed explanation of project [here](./Ticket.pdf).

# Structure

- [Repo scheme](#repo-scheme)
- [About](#about)
- [Solution](#solution)
- [Requirements](#requirements)
- [PayPal setup](#paypal-setup)

#   Repo scheme
```bash
.
├── android
│
├── android2
│
├── web
│
├── contracts
│   ├── contracts
│   │   └── Ticket721.sol
│   └── ctrl_server.py
│
└── README.md
```

<code>android</code> - android application for client (ticket owner).  

<code>android2</code> - android application for security staff. 

<code>web</code> - directory with web-utils (web-site, back-end and etc)

<code>contracts</code> - smart contracts, utils for interaction with Ethereum, staff for seats tracking

# About
The world ticket market in 2018 amounted to $ 80 billion, and the market is expected to grow to $ 112 billion by 2023. Distributors sell most of the tickets online 55–80%. The secondary market share is 30% and is estimated at $ 24 billion (Grand View Research).
One of the main problems of the market is that tickets purchased in the secondary market are not trustworthy.
The problem of ticket counterfeiting leads to the fact that spectators cannot get to the event, and the organizers lose part of the profit and customer loyalty.
The share of fake tickets is on average 20%, as a result of which the profit not received by the organizers can reach hundreds of thousands of dollars for an event. The annual loss of profit is estimated at 2-5 billion dollars.

## Advantages of the proposed solution. ##
For event organizers:
<li>  Open and reliable information about the ticket purchase history
<li>  Distributor and user database
<li>  A unified system with instant tracking of available tickets

For event visitors:
<li>  Guaranteed purchase of a genuine ticket
<li>  The ability to safely delegate a ticket without financial loss


# Solution
![Solution](e "Solution")

Our proposition is to represent a ticket as <b>unique burnable ERC-721</b> token with some modifications. On the picture You can see a lifecycle of the ticket.  

1.  Ticket distributor is a token issuer. He should deploy smart contract for a given event.
2.  Each client who wants to buy a ticket should transfer money to the PayPal account of token issuer. Information about this payout is taken by the smart contract through ChainLink oracles from PayPal external adapter. Client takes an onwership of this token if he pays enough money.
3.  If client doesn't want to visit an event and wants to sell a ticket, he can do it easily. He should find a buyer and delegate an ownership to him. Delegation function of the smart contract is activated only if appropriate transaction in PayPal approved. At the same time in case of a buyer, if you sent a money to the given PayPal account, it's guaranteed that token is delegeated to your.   
4. Validity of the tokens should be checked by the ticket ditributor representatives (security staff on the entrance) when owner of the ticket comes to the event. Procedure of validation is following:

* For token id (<code>tid</code>), user calculates signature <code><b>Sign</b>(sk, tid) = &sigma;</code>. <code>tid</code> and <code>&sigma;</code> are represented as QR-code.

* Security staff should scan QR-code and get <code>tid</code> and <code>&sigma;'</code>, check <code><b>Verify</b>(tid, pk, &sigma;') = 1</code>. 
  
5. After that security should <b>burn</b> this token.

# Requirements
<li>Solidity ^4.20
<li> python 3.5+
<ol type="a" style="font-size: small;">
  <li> Brownie (and dependecies)
  <li> Flask
</ol>
<li> Android SDK API 26

# PayPal setup
PayPal external adapter could be found [here](https://github.com/smartcontractkit/paypal-adapter).

To use PayPal API you should create sandbox accounts on the website.

<b>Send payout:</b>
```curl
curl --location --request POST "https://api.sandbox.paypal.com/v1/payments/payouts" \
  --header "Content-Type: application/json" \
  --header ": " \
  --data "{
  \"sender_batch_header\": {
    \"sender_batch_id\": \"Payouts_2018_100007\",
    \"email_subject\": \"You have a payout!\",
    \"email_message\": \"You have received a payout! Thanks for using our service!\"
  },
  \"items\": [
    {
      \"recipient_type\": \"EMAIL\",
      \"amount\": {
        \"value\": \"9.87\",
        \"currency\": \"USD\"
      },
      \"receiver\": \"some-account@business.example.com\",
      \"sender_item_id\": \"201403140001\"
    }
  ]
}"
```

<b>Get info about payout:</b>
```
curl --location --request GET "https://api.sandbox.paypal.com/v1/payments/payouts/1P916489AB900520A" \
  --header "Content-Type: application/json"
```

Also you should append your access token to the headers.

