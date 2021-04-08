package com.inteca.Inteca.dao;

import com.inteca.Inteca.model.Kredyt;

import java.util.*;

public interface KredytDAO{



    void createCredit(Kredyt kredyt);

    List<Kredyt> getCredits();
}
