package com.tdawg.restExample;

import org.junit.Before;
import org.junit.Test;

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
}
