package com.tdawg.restExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContractController {

    ContractController() {
    }

    @GetMapping("/contracts")
    List<Contract> all() {
        List<Contract> something = new ArrayList<Contract>();
        something.add(new Contract());
        return something;
    }
}
