package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Kredyt;
import com.inteca.Inteca.service.KredytServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CreateCreditController {

    private KredytServiceImpl kredytService;

    @RequestMapping(value= {"/addCredit"}, method= RequestMethod.POST)
    public void createCredit(@RequestBody Kredyt kredyt){
        kredytService.createCredit(kredyt);
    }
}
