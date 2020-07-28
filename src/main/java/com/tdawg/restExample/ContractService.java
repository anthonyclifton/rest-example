package com.tdawg.restExample;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;

@Service
public class ContractService {

    private HashMap<String, Contract> contracts = new LinkedHashMap<String, Contract>();

    public Contract add(Contract contract) {
        contract.setId(UUID.randomUUID().toString());
        this.contracts.put(contract.getId(), contract);
        return contract;
    }

    public Contract get(String id) {
        return this.contracts.get(id);
    }

    public ArrayList<Contract> getAll() {
        return new ArrayList<Contract>(this.contracts.values());
    }
}
