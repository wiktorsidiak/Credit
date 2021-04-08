package com.inteca.Inteca.service;

import com.inteca.Inteca.ResponseTemplates.Klient;
import com.inteca.Inteca.ResponseTemplates.Produkt;
import com.inteca.Inteca.ResponseTemplates.ResponseTemplateAO;
import com.inteca.Inteca.ResponseTemplates.ResponseTemplateNO;
import com.inteca.Inteca.dao.KredytDAOImpl;
import com.inteca.Inteca.model.Kredyt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class KredytServiceImpl implements KredytService {

    private RestTemplate restTemplate;


    private KredytDAOImpl kredytDAO;

    @Override
    public void createCredit(Kredyt kredyt) {
        kredytDAO.createCredit(kredyt);
    }

    @Override
    public List<Kredyt> getCredits() {
        return kredytDAO.getCredits();
    }

    }
}