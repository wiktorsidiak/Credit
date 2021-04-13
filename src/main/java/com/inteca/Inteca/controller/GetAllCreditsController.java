package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Credit;
import com.inteca.Inteca.service.CreditService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/credit")
@AllArgsConstructor
public class GetAllCreditsController {
    private final CreditService creditService;

    @RequestMapping(value= {"/credits"}, method= RequestMethod.GET)
    public List<Credit> getAllCredits() {
        return creditService.getCredits();
    }
}
