package com.inteca.Inteca.service;

import com.inteca.Inteca.ResponseTemplates.Klient;
import com.inteca.Inteca.ResponseTemplates.Produkt;
import com.inteca.Inteca.ResponseTemplates.ResponseTemplateAO;
import com.inteca.Inteca.ResponseTemplates.ResponseTemplateNO;
import com.inteca.Inteca.model.Kredyt;

import java.util.List;

public interface KredytService {

    void createCredit(Kredyt kredyt);

    List<Kredyt> getCredits();

}

