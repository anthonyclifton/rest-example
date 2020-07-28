package com.tdawg.restExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContractController {

    @Autowired private ContractService contractService;

    ContractController() {
    }

    @GetMapping("/contracts")
    List<Contract> all() {
        return contractService.getAll();
    }

    @PostMapping("/contracts")
    Contract add(@RequestBody Contract newContract) {
        System.out.println(newContract);
        Contract contractWithId = contractService.add(newContract);
        return contractWithId;
    }
}
