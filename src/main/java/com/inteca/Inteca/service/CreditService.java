package com.inteca.Inteca.service;

import com.inteca.Inteca.model.Credit;
import java.util.List;

public interface CreditService {

    void createCredit(Credit credit);

    List<Credit> getCredits();

}

