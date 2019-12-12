from brownie import *
import json

def main():
    with open("keys/keys.json", "r") as keyfile:
        keys = json.load(keyfile)
        for pair in keys:
            accounts.add(pair['sk'])