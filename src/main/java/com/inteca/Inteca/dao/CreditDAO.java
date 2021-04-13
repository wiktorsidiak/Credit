package com.inteca.Inteca.dao;

import com.inteca.Inteca.model.Credit;

import java.util.*;

public interface CreditDAO {

    void createCredit(Credit credit);

    List<Credit> getCredits();
}
