package com.tdawg.restExample;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ContractServiceTest {
    private ContractService service;

    @Before
    public void setup() {
        service = new ContractService();
    }

    @Test
    public void shouldAssignIdToAddedContract() {
        Contract result = service.add(new Contract());
        assert result.getId() != null;
    }

    @Test
    public void shouldPersistAddedContract() {
        Contract expectedContract = new Contract();

        String contractId = service.add(expectedContract).getId();
        Contract persistedContract = service.get(contractId);

        assert expectedContract.equals(persistedContract);
    }

    @Test
    public void shouldPersistContractsWithUniqueIds() {
        Contract expectedContract1 = new Contract();
        Contract expectedContract2 = new Contract();

        String contractId1 = service.add(expectedContract1).getId();
        String contractId2 = service.add(expectedContract2).getId();

        assert !contractId1.equals(contractId2);
    }

    @Test
    public void shouldReturnAllContracts() {
        Contract contract1 = new Contract();
        Contract contract2 = new Contract();
        Contract contract3 = new Contract();

        service.add(contract1);
        service.add(contract2);
        service.add(contract3);

        ArrayList<Contract> contracts = service.getAll();

        assert contracts.size() == 3;
    }
}
