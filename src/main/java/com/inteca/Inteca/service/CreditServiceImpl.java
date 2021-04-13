package com.inteca.Inteca.service;

import com.inteca.Inteca.dao.CreditDAO;
import com.inteca.Inteca.model.Credit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreditServiceImpl implements CreditService {

    private final CreditDAO creditDAO;

    @Override
    public void createCredit(Credit credit) {
        creditDAO.createCredit(credit);
    }

    @Override
    public List<Credit> getCredits() {
        return creditDAO.getCredits();
    }

}