package com.inteca.Inteca.mapper;

import com.inteca.Inteca.model.Kredyt;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KredytMapper implements RowMapper<Kredyt> {
    @Override
    public Kredyt mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Kredyt kredyt = new Kredyt();
        kredyt.setCreditId((long) resultSet.getInt("credit_id"));
        kredyt.setCreditName(resultSet.getString("credit_name"));
        return kredyt;
    }
}
