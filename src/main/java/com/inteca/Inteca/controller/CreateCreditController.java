package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Credit;
import com.inteca.Inteca.service.CreditServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit")
@RequiredArgsConstructor
public class CreateCreditController {

    private final CreditServiceImpl kredytService;

    @RequestMapping(value= {"/addCredit"}, method= RequestMethod.POST)
    public void createCredit(@RequestBody Credit credit){
        kredytService.createCredit(credit);
    }
}
