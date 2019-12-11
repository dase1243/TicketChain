//package come.manager.direct.hackuniversity.model;
//
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.Callable;
//import org.web3j.abi.EventEncoder;
//import org.web3j.abi.TypeReference;
//import org.web3j.abi.datatypes.Address;
//import org.web3j.abi.datatypes.Bool;
//import org.web3j.abi.datatypes.DynamicArray;
//import org.web3j.abi.datatypes.Event;
//import org.web3j.abi.datatypes.Function;
//import org.web3j.abi.datatypes.Type;
//import org.web3j.abi.datatypes.Utf8String;
//import org.web3j.abi.datatypes.generated.Uint256;
//import org.web3j.crypto.Credentials;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.DefaultBlockParameter;
//import org.web3j.protocol.core.RemoteCall;
//import org.web3j.protocol.core.methods.request.EthFilter;
//import org.web3j.protocol.core.methods.response.Log;
//import org.web3j.protocol.core.methods.response.TransactionReceipt;
//import org.web3j.tx.Contract;
//import org.web3j.tx.TransactionManager;
//import rx.Observable;
//import rx.functions.Func1;
//
///**
// * <p>Auto generated code.
// * <p><strong>Do not modify!</strong>
// * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
// * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
// * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
// *
// * <p>Generated with web3j version 3.4.0.
// */
//public class Token extends Contract {
//    private static final String BINARY = "60606040908152600b805460a060020a60ff02191690556103e89080519081016040908152600982527f4c656e696e67726164000000000000000000000000000000000000000000000060208301528051908101604052600381527f4c4e4400000000000000000000000000000000000000000000000000000000006020820152600482805162000095929160200190620000e0565b506005818051620000ab929160200190620000e0565b5050600b8054600160a060020a03191633600160a060020a03161790555060008111620000d757600080fd5b600c5562000185565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200012357805160ff191683800117855562000153565b8280016001018555821562000153579182015b828111156200015357825182559160200191906001019062000136565b506200016192915062000165565b5090565b6200018291905b808211156200016157600081556001016200016c565b90565b6118c880620001956000396000f3006060604052600436106101695763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166305d2035b811461016e57806306fdde0314610195578063081812fc1461021f578063095ea7b314610251578063162094c41461027557806318160ddd1461029757806323b872dd146102bc578063278a2e50146102e45780632f745c5914610306578063355274ea1461032857806340c10f191461033b57806342842e0e1461035d57806342966c68146103855780634a99950b1461039b5780634f558e79146104005780634f6ccce7146104165780635c21bc2c1461042c5780636352211e1461049157806370a08231146104a75780637d64bcb4146104c65780638462151c146104d95780638da5cb5b1461054b57806395d89b411461055e578063a22cb46514610571578063b88d4fde14610595578063c87b56dd14610601578063e985e9c514610617578063f2fde38b1461063c575b600080fd5b341561017957600080fd5b61018161065b565b604051901515815260200160405180910390f35b34156101a057600080fd5b6101a861066b565b60405160208082528190810183818151815260200191508051906020019080838360005b838110156101e45780820151838201526020016101cc565b50505050905090810190601f1680156102115780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561022a57600080fd5b610235600435610714565b604051600160a060020a03909116815260200160405180910390f35b341561025c57600080fd5b610273600160a060020a036004351660243561072f565b005b341561028057600080fd5b61027360048035906024803590810191013561082b565b34156102a257600080fd5b6102aa610891565b60405190815260200160405180910390f35b34156102c757600080fd5b610273600160a060020a0360043581169060243516604435610897565b34156102ef57600080fd5b610273600160a060020a0360043516602435610942565b341561031157600080fd5b6102aa600160a060020a0360043516602435610974565b341561033357600080fd5b6102aa6109c2565b341561034657600080fd5b610273600160a060020a03600435166024356109c8565b341561036857600080fd5b610273600160a060020a0360043581169060243516604435610a2f565b341561039057600080fd5b610273600435610a5f565b34156103a657600080fd5b61027360048035600160a060020a03169060248035919060649060443590810190830135806020601f82018190048102016040519081016040528181529291906020840183838082843750949650610a6c95505050505050565b341561040b57600080fd5b610181600435610ac4565b341561042157600080fd5b6102aa600435610ae1565b341561043757600080fd5b61027360048035600160a060020a03169060248035919060649060443590810190830135806020601f82018190048102016040519081016040528181529291906020840183838082843750949650610b1795505050505050565b341561049c57600080fd5b610235600435610b3d565b34156104b257600080fd5b6102aa600160a060020a0360043516610b67565b34156104d157600080fd5b610181610b9a565b34156104e457600080fd5b6104f8600160a060020a0360043516610c25565b60405160208082528190810183818151815260200191508051906020019060200280838360005b8381101561053757808201518382015260200161051f565b505050509050019250505060405180910390f35b341561055657600080fd5b610235610ca8565b341561056957600080fd5b6101a8610cb7565b341561057c57600080fd5b610273600160a060020a03600435166024351515610d2a565b34156105a057600080fd5b610273600160a060020a036004803582169160248035909116916044359160849060643590810190830135806020601f82018190048102016040519081016040528181529291906020840183838082843750949650610dbb95505050505050565b341561060c57600080fd5b6101a8600435610dfa565b341561062257600080fd5b610181600160a060020a0360043581169060243516610ebf565b341561064757600080fd5b610273600160a060020a0360043516610eed565b600b5460a060020a900460ff1681565b61067361178e565b60048054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156107095780601f106106de57610100808354040283529160200191610709565b820191906000526020600020905b8154815290600101906020018083116106ec57829003601f168201915b505050505090505b90565b600090815260016020526040902054600160a060020a031690565b600061073a82610b3d565b9050600160a060020a03838116908216141561075557600080fd5b80600160a060020a031633600160a060020a0316148061077a575061077a8133610ebf565b151561078557600080fd5b600061079083610714565b600160a060020a03161415806107ae5750600160a060020a03831615155b156108265760008281526001602052604090819020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0386811691821790925591908316907f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b9259085905190815260200160405180910390a35b505050565b8233600160a060020a031661083f82610b3d565b600160a060020a03161461085257600080fd5b61088b8484848080601f016020809104026020016040519081016040528181529291906020840183838082843750610f88945050505050565b50505050565b60085490565b806108a23382610fbb565b15156108ad57600080fd5b600160a060020a03841615156108c257600080fd5b600160a060020a03831615156108d757600080fd5b6108e1848361101a565b6108eb84836110c9565b6108f583836111f7565b82600160a060020a031684600160a060020a03167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef8460405190815260200160405180910390a350505050565b8033600160a060020a031661095682610b3d565b600160a060020a03161461096957600080fd5b610826338484610897565b600061097f83610b67565b821061098a57600080fd5b600160a060020a03831660009081526006602052604090208054839081106109ae57fe5b906000526020600020900154905092915050565b600c5481565b600b5433600160a060020a039081169116146109e357600080fd5b600b5460a060020a900460ff16156109fa57600080fd5b600c54610a166001610a0a610891565b9063ffffffff61125116565b1115610a2157600080fd5b610a2b828261125e565b5050565b80610a3a3382610fbb565b1515610a4557600080fd5b61088b848484602060405190810160405260008152610dbb565b610a69338261129a565b50565b600b5433600160a060020a03908116911614610a8757600080fd5b600b5460a060020a900460ff1615610a9e57600080fd5b600c54610aae6001610a0a610891565b1115610ab957600080fd5b610826838383611395565b600090815260208190526040902054600160a060020a0316151590565b6000610aeb610891565b8210610af657600080fd5b6008805483908110610b0457fe5b9060005260206000209001549050919050565b600b5433600160a060020a03908116911614610b3257600080fd5b610826838383610a6c565b600081815260208190526040812054600160a060020a0316801515610b6157600080fd5b92915050565b6000600160a060020a0382161515610b7e57600080fd5b50600160a060020a031660009081526002602052604090205490565b600b5460009033600160a060020a03908116911614610bb857600080fd5b600b5460a060020a900460ff1615610bcf57600080fd5b600b805474ff0000000000000000000000000000000000000000191660a060020a1790557fae5184fba832cb2b1f702aca6117b8d265eaf03ad33eb133f19dde0f5920fa0860405160405180910390a150600190565b610c2d61178e565b6006600083600160a060020a0316600160a060020a03168152602001908152602001600020805480602002602001604051908101604052809291908181526020018280548015610c9c57602002820191906000526020600020905b815481526020019060010190808311610c88575b50505050509050919050565b600b54600160a060020a031681565b610cbf61178e565b60058054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156107095780601f106106de57610100808354040283529160200191610709565b33600160a060020a031682600160a060020a031614151515610d4b57600080fd5b33600160a060020a0390811660008181526003602090815260408083209487168084529490915290819020805460ff19168515151790557f17307eab39ab6107e8899845ad3d59bd9653f200f220920489ca2b5937696c3190849051901515815260200160405180910390a35050565b81610dc63382610fbb565b1515610dd157600080fd5b610ddc858585610897565b610de8858585856113db565b1515610df357600080fd5b5050505050565b610e0261178e565b610e0b82610ac4565b1515610e1657600080fd5b600a60008381526020019081526020016000208054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610c9c5780601f10610e9257610100808354040283529160200191610c9c565b820191906000526020600020905b815481529060010190602001808311610ea05750939695505050505050565b600160a060020a03918216600090815260036020908152604080832093909416825291909152205460ff1690565b600b5433600160a060020a03908116911614610f0857600080fd5b600160a060020a0381161515610f1d57600080fd5b600b54600160a060020a0380831691167f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e060405160405180910390a3600b805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0392909216919091179055565b610f9182610ac4565b1515610f9c57600080fd5b6000828152600a602052604090208180516108269291602001906117a0565b600080610fc783610b3d565b905080600160a060020a031684600160a060020a03161480611002575083600160a060020a0316610ff784610714565b600160a060020a0316145b8061101257506110128185610ebf565b949350505050565b81600160a060020a031661102d82610b3d565b600160a060020a03161461104057600080fd5b600081815260016020526040902054600160a060020a031615610a2b57600081815260016020526040808220805473ffffffffffffffffffffffffffffffffffffffff19169055600160a060020a038416907f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b9259084905190815260200160405180910390a35050565b60008060006110d8858561155a565b600084815260076020908152604080832054600160a060020a038916845260069092529091205490935061111390600163ffffffff6115ef16565b600160a060020a03861660009081526006602052604090208054919350908390811061113b57fe5b6000918252602080832090910154600160a060020a038816835260069091526040909120805491925082918590811061117057fe5b6000918252602080832090910192909255600160a060020a03871681526006909152604081208054849081106111a257fe5b6000918252602080832090910192909255600160a060020a03871681526006909152604090208054906111d990600019830161181e565b50600093845260076020526040808520859055908452909220555050565b60006112038383611601565b50600160a060020a0382166000908152600660205260409020805490816001810161122e838261181e565b506000918252602080832091909101849055928152600790925260409091205550565b81810182811015610b6157fe5b600b5433600160a060020a0390811691161461127957600080fd5b600b5460a060020a900460ff161561129057600080fd5b610a2b8282611690565b60008060006112a985856116cd565b6000848152600a602052604090205460026000196101006001841615020190911604156112e7576000848152600a602052604081206112e791611842565b60008481526009602052604090205460085490935061130d90600163ffffffff6115ef16565b915060088281548110151561131e57fe5b90600052602060002090015490508060088481548110151561133c57fe5b6000918252602082200191909155600880548490811061135857fe5b600091825260209091200155600880549061137790600019830161181e565b50600093845260096020526040808520859055908452909220555050565b600b5433600160a060020a039081169116146113b057600080fd5b600b5460a060020a900460ff16156113c757600080fd5b6113d18383611690565b6108268282610f88565b6000806113f085600160a060020a0316611724565b15156113ff5760019150611551565b84600160a060020a031663f0b9e5ba8786866000604051602001526040518463ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004018084600160a060020a0316600160a060020a0316815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b838110156114a0578082015183820152602001611488565b50505050905090810190601f1680156114cd5780820380516001836020036101000a031916815260200191505b50945050505050602060405180830381600087803b15156114ed57600080fd5b6102c65a03f115156114fe57600080fd5b50505060405180517fffffffff0000000000000000000000000000000000000000000000000000000081167ff0b9e5ba000000000000000000000000000000000000000000000000000000001493509150505b50949350505050565b81600160a060020a031661156d82610b3d565b600160a060020a03161461158057600080fd5b600160a060020a0382166000908152600260205260409020546115aa90600163ffffffff6115ef16565b600160a060020a039092166000908152600260209081526040808320949094559181529081905220805473ffffffffffffffffffffffffffffffffffffffff19169055565b6000828211156115fb57fe5b50900390565b600081815260208190526040902054600160a060020a03161561162357600080fd5b600081815260208181526040808320805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03871690811790915583526002909152902054611670906001611251565b600160a060020a0390921660009081526002602052604090209190915550565b61169a828261172c565b600880546000838152600960205260409020819055600181016116bd838261181e565b5060009182526020909120015550565b6116d7828261101a565b6116e182826110c9565b6000600160a060020a0383167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef8360405190815260200160405180910390a35050565b6000903b1190565b600160a060020a038216151561174157600080fd5b61174b82826111f7565b600160a060020a03821660007fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef8360405190815260200160405180910390a35050565b60206040519081016040526000815290565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106117e157805160ff191683800117855561180e565b8280016001018555821561180e579182015b8281111561180e5782518255916020019190600101906117f3565b5061181a929150611882565b5090565b81548183558181151161082657600083815260209020610826918101908301611882565b50805460018160011615610100020316600290046000825580601f106118685750610a69565b601f016020900490600052602060002090810190610a6991905b61071191905b8082111561181a57600081556001016118885600a165627a7a723058201ac957ce9fad2e0673ec5829e82f1ebd89abaf43139b53e113b69c983edecf3a0029";
//
//    public static final String FUNC_MINTINGFINISHED = "mintingFinished";
//
//    public static final String FUNC_NAME = "name";
//
//    public static final String FUNC_GETAPPROVED = "getApproved";
//
//    public static final String FUNC_APPROVE = "approve";
//
//    public static final String FUNC_SETTOKENURI = "setTokenURI";
//
//    public static final String FUNC_TOTALSUPPLY = "totalSupply";
//
//    public static final String FUNC_TRANSFERFROM = "transferFrom";
//
//    public static final String FUNC_DELEGATETOKEN = "delegateToken";
//
//    public static final String FUNC_TOKENOFOWNERBYINDEX = "tokenOfOwnerByIndex";
//
//    public static final String FUNC_CAP = "cap";
//
//    public static final String FUNC_MINT = "mint";
//
//    public static final String FUNC_SAFETRANSFERFROM = "safeTransferFrom";
//
//    public static final String FUNC_BURN = "burn";
//
//    public static final String FUNC_MINTWITHURI = "mintWithURI";
//
//    public static final String FUNC_EXISTS = "exists";
//
//    public static final String FUNC_TOKENBYINDEX = "tokenByIndex";
//
//    public static final String FUNC_CREATETOKEN = "createToken";
//
//    public static final String FUNC_OWNEROF = "ownerOf";
//
//    public static final String FUNC_BALANCEOF = "balanceOf";
//
//    public static final String FUNC_FINISHMINTING = "finishMinting";
//
//    public static final String FUNC_TOKENSOFOWNER = "tokensOfOwner";
//
//    public static final String FUNC_OWNER = "owner";
//
//    public static final String FUNC_SYMBOL = "symbol";
//
//    public static final String FUNC_SETAPPROVALFORALL = "setApprovalForAll";
//
//    public static final String FUNC_TOKENURI = "tokenURI";
//
//    public static final String FUNC_ISAPPROVEDFORALL = "isApprovedForAll";
//
//    public static final String FUNC_TRANSFEROWNERSHIP = "transferOwnership";
//
//    public static final Event MINTFINISHED_EVENT = new Event("MintFinished",
//            Arrays.<TypeReference<?>>asList(),
//            Arrays.<TypeReference<?>>asList());
//    ;
//
//    public static final Event OWNERSHIPTRANSFERRED_EVENT = new Event("OwnershipTransferred",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
//            Arrays.<TypeReference<?>>asList());
//    ;
//
//    public static final Event TRANSFER_EVENT = new Event("Transfer",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
//            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//    ;
//
//    public static final Event APPROVAL_EVENT = new Event("Approval",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
//            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//    ;
//
//    public static final Event APPROVALFORALL_EVENT = new Event("ApprovalForAll",
//            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
//            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//    ;
//
//    protected Token(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    protected Token(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//
//    public RemoteCall<Boolean> mintingFinished() {
//        final Function function = new Function(FUNC_MINTINGFINISHED,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//        return executeRemoteCallSingleValueReturn(function, Boolean.class);
//    }
//
//    public RemoteCall<String> name() {
//        final Function function = new Function(FUNC_NAME,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteCall<String> getApproved(BigInteger _tokenId) {
//        final Function function = new Function(FUNC_GETAPPROVED,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteCall<TransactionReceipt> approve(String _to, BigInteger _tokenId) {
//        final Function function = new Function(
//                FUNC_APPROVE,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<TransactionReceipt> setTokenURI(BigInteger _tokenId, String _uri) {
//        final Function function = new Function(
//                FUNC_SETTOKENURI,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tokenId),
//                        new org.web3j.abi.datatypes.Utf8String(_uri)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<BigInteger> totalSupply() {
//        final Function function = new Function(FUNC_TOTALSUPPLY,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteCall<TransactionReceipt> transferFrom(String _from, String _to, BigInteger _tokenId) {
//        final Function function = new Function(
//                FUNC_TRANSFERFROM,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from),
//                        new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<TransactionReceipt> delegateToken(String _to, BigInteger _tokenId) {
//        final Function function = new Function(
//                FUNC_DELEGATETOKEN,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<BigInteger> tokenOfOwnerByIndex(String _owner, BigInteger _index) {
//        final Function function = new Function(FUNC_TOKENOFOWNERBYINDEX,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner),
//                        new org.web3j.abi.datatypes.generated.Uint256(_index)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteCall<BigInteger> cap() {
//        final Function function = new Function(FUNC_CAP,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteCall<TransactionReceipt> mint(String _to, BigInteger _tokenId) {
//        final Function function = new Function(
//                FUNC_MINT,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<TransactionReceipt> safeTransferFrom(String _from, String _to, BigInteger _tokenId) {
//        final Function function = new Function(
//                FUNC_SAFETRANSFERFROM,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from),
//                        new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<TransactionReceipt> burn(BigInteger _tokenId) {
//        final Function function = new Function(
//                FUNC_BURN,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<TransactionReceipt> mintWithURI(String _to, BigInteger _tokenId, String _uri) {
//        final Function function = new Function(
//                FUNC_MINTWITHURI,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.generated.Uint256(_tokenId),
//                        new org.web3j.abi.datatypes.Utf8String(_uri)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<Boolean> exists(BigInteger _tokenId) {
//        final Function function = new Function(FUNC_EXISTS,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//        return executeRemoteCallSingleValueReturn(function, Boolean.class);
//    }
//
//    public RemoteCall<BigInteger> tokenByIndex(BigInteger _index) {
//        final Function function = new Function(FUNC_TOKENBYINDEX,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_index)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteCall<TransactionReceipt> createToken(String _to, BigInteger _tokenId, String _uri) {
//        final Function function = new Function(
//                FUNC_CREATETOKEN,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.generated.Uint256(_tokenId),
//                        new org.web3j.abi.datatypes.Utf8String(_uri)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<String> ownerOf(BigInteger _tokenId) {
//        final Function function = new Function(FUNC_OWNEROF,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteCall<BigInteger> balanceOf(String _owner) {
//        final Function function = new Function(FUNC_BALANCEOF,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
//    }
//
//    public RemoteCall<TransactionReceipt> finishMinting() {
//        final Function function = new Function(
//                FUNC_FINISHMINTING,
//                Arrays.<Type>asList(),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<List> tokensOfOwner(String _owner) {
//        final Function function = new Function(FUNC_TOKENSOFOWNER,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
//        return new RemoteCall<List>(
//                new Callable<List>() {
//                    @Override
//                    @SuppressWarnings("unchecked")
//                    public List call() throws Exception {
//                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
//                        return convertToNative(result);
//                    }
//                });
//    }
//
//    public RemoteCall<String> owner() {
//        final Function function = new Function(FUNC_OWNER,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteCall<String> symbol() {
//        final Function function = new Function(FUNC_SYMBOL,
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteCall<TransactionReceipt> setApprovalForAll(String _to, Boolean _approved) {
//        final Function function = new Function(
//                FUNC_SETAPPROVALFORALL,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.Bool(_approved)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<TransactionReceipt> safeTransferFrom(String _from, String _to, BigInteger _tokenId, byte[] _data) {
//        final Function function = new Function(
//                FUNC_SAFETRANSFERFROM,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from),
//                        new org.web3j.abi.datatypes.Address(_to),
//                        new org.web3j.abi.datatypes.generated.Uint256(_tokenId),
//                        new org.web3j.abi.datatypes.DynamicBytes(_data)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<String> tokenURI(BigInteger _tokenId) {
//        final Function function = new Function(FUNC_TOKENURI,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tokenId)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteCall<Boolean> isApprovedForAll(String _owner, String _operator) {
//        final Function function = new Function(FUNC_ISAPPROVEDFORALL,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner),
//                        new org.web3j.abi.datatypes.Address(_operator)),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
//        return executeRemoteCallSingleValueReturn(function, Boolean.class);
//    }
//
//    public RemoteCall<TransactionReceipt> transferOwnership(String newOwner) {
//        final Function function = new Function(
//                FUNC_TRANSFEROWNERSHIP,
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(newOwner)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public static RemoteCall<Token> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
//        return deployRemoteCall(Token.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
//    }
//
//    public static RemoteCall<Token> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
//        return deployRemoteCall(Token.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
//    }
//
//    public List<MintFinishedEventResponse> getMintFinishedEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(MINTFINISHED_EVENT, transactionReceipt);
//        ArrayList<MintFinishedEventResponse> responses = new ArrayList<MintFinishedEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            MintFinishedEventResponse typedResponse = new MintFinishedEventResponse();
//            typedResponse.log = eventValues.getLog();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public Observable<MintFinishedEventResponse> mintFinishedEventObservable(EthFilter filter) {
//        return web3j.ethLogObservable(filter).map(new Func1<Log, MintFinishedEventResponse>() {
//            @Override
//            public MintFinishedEventResponse call(Log log) {
//                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(MINTFINISHED_EVENT, log);
//                MintFinishedEventResponse typedResponse = new MintFinishedEventResponse();
//                typedResponse.log = log;
//                return typedResponse;
//            }
//        });
//    }
//
//    public Observable<MintFinishedEventResponse> mintFinishedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(MINTFINISHED_EVENT));
//        return mintFinishedEventObservable(filter);
//    }
//
//    public List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, transactionReceipt);
//        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public Observable<OwnershipTransferredEventResponse> ownershipTransferredEventObservable(EthFilter filter) {
//        return web3j.ethLogObservable(filter).map(new Func1<Log, OwnershipTransferredEventResponse>() {
//            @Override
//            public OwnershipTransferredEventResponse call(Log log) {
//                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, log);
//                OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
//                typedResponse.log = log;
//                typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
//                typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
//                return typedResponse;
//            }
//        });
//    }
//
//    public Observable<OwnershipTransferredEventResponse> ownershipTransferredEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERRED_EVENT));
//        return ownershipTransferredEventObservable(filter);
//    }
//
//    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFER_EVENT, transactionReceipt);
//        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            TransferEventResponse typedResponse = new TransferEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse._to = (String) eventValues.getIndexedValues().get(1).getValue();
//            typedResponse._tokenId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public Observable<TransferEventResponse> transferEventObservable(EthFilter filter) {
//        return web3j.ethLogObservable(filter).map(new Func1<Log, TransferEventResponse>() {
//            @Override
//            public TransferEventResponse call(Log log) {
//                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFER_EVENT, log);
//                TransferEventResponse typedResponse = new TransferEventResponse();
//                typedResponse.log = log;
//                typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
//                typedResponse._to = (String) eventValues.getIndexedValues().get(1).getValue();
//                typedResponse._tokenId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//                return typedResponse;
//            }
//        });
//    }
//
//    public Observable<TransferEventResponse> transferEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(TRANSFER_EVENT));
//        return transferEventObservable(filter);
//    }
//
//    public List<ApprovalEventResponse> getApprovalEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(APPROVAL_EVENT, transactionReceipt);
//        ArrayList<ApprovalEventResponse> responses = new ArrayList<ApprovalEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            ApprovalEventResponse typedResponse = new ApprovalEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse._owner = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse._approved = (String) eventValues.getIndexedValues().get(1).getValue();
//            typedResponse._tokenId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public Observable<ApprovalEventResponse> approvalEventObservable(EthFilter filter) {
//        return web3j.ethLogObservable(filter).map(new Func1<Log, ApprovalEventResponse>() {
//            @Override
//            public ApprovalEventResponse call(Log log) {
//                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(APPROVAL_EVENT, log);
//                ApprovalEventResponse typedResponse = new ApprovalEventResponse();
//                typedResponse.log = log;
//                typedResponse._owner = (String) eventValues.getIndexedValues().get(0).getValue();
//                typedResponse._approved = (String) eventValues.getIndexedValues().get(1).getValue();
//                typedResponse._tokenId = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
//                return typedResponse;
//            }
//        });
//    }
//
//    public Observable<ApprovalEventResponse> approvalEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(APPROVAL_EVENT));
//        return approvalEventObservable(filter);
//    }
//
//    public List<ApprovalForAllEventResponse> getApprovalForAllEvents(TransactionReceipt transactionReceipt) {
//        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(APPROVALFORALL_EVENT, transactionReceipt);
//        ArrayList<ApprovalForAllEventResponse> responses = new ArrayList<ApprovalForAllEventResponse>(valueList.size());
//        for (Contract.EventValuesWithLog eventValues : valueList) {
//            ApprovalForAllEventResponse typedResponse = new ApprovalForAllEventResponse();
//            typedResponse.log = eventValues.getLog();
//            typedResponse._owner = (String) eventValues.getIndexedValues().get(0).getValue();
//            typedResponse._operator = (String) eventValues.getIndexedValues().get(1).getValue();
//            typedResponse._approved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public Observable<ApprovalForAllEventResponse> approvalForAllEventObservable(EthFilter filter) {
//        return web3j.ethLogObservable(filter).map(new Func1<Log, ApprovalForAllEventResponse>() {
//            @Override
//            public ApprovalForAllEventResponse call(Log log) {
//                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(APPROVALFORALL_EVENT, log);
//                ApprovalForAllEventResponse typedResponse = new ApprovalForAllEventResponse();
//                typedResponse.log = log;
//                typedResponse._owner = (String) eventValues.getIndexedValues().get(0).getValue();
//                typedResponse._operator = (String) eventValues.getIndexedValues().get(1).getValue();
//                typedResponse._approved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
//                return typedResponse;
//            }
//        });
//    }
//
//    public Observable<ApprovalForAllEventResponse> approvalForAllEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
//        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(APPROVALFORALL_EVENT));
//        return approvalForAllEventObservable(filter);
//    }
//
//    public static Token load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        return new Token(contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    public static Token load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        return new Token(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//
//    public static class MintFinishedEventResponse {
//        public Log log;
//    }
//
//    public static class OwnershipTransferredEventResponse {
//        public Log log;
//
//        public String previousOwner;
//
//        public String newOwner;
//    }
//
//    public static class TransferEventResponse {
//        public Log log;
//
//        public String _from;
//
//        public String _to;
//
//        public BigInteger _tokenId;
//    }
//
//    public static class ApprovalEventResponse {
//        public Log log;
//
//        public String _owner;
//
//        public String _approved;
//
//        public BigInteger _tokenId;
//    }
//
//    public static class ApprovalForAllEventResponse {
//        public Log log;
//
//        public String _owner;
//
//        public String _operator;
//
//        public Boolean _approved;
//    }
//}
