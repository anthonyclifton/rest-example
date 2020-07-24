package com.tdawg.restExample;

public class ContractService {
    public Contract add(Contract contract) {
        contract.setId("something");
        return contract;
    }
}
