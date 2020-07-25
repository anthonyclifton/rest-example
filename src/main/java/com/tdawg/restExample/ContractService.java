package com.tdawg.restExample;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ContractService {

    private HashMap<String, Contract> contracts = new LinkedHashMap<String, Contract>();

    public Contract add(Contract contract) {
        contract.setId("something");
        this.contracts.put(contract.getId(), contract);
        return contract;
    }

    public Contract get(String id) {
        return this.contracts.get(id);
    }
}
