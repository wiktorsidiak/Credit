package com.inteca.Inteca.controller;

import com.inteca.Inteca.model.Kredyt;
import com.inteca.Inteca.service.KredytServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetAllCreditsController {
    private RestTemplate restTemplate;

    private KredytServiceImpl kredytService;
    @RequestMapping(value= {"/credits"}, method= RequestMethod.GET)

    public List<Kredyt> getAllCredits() {
        return kredytService.getCredits();
    }
}
