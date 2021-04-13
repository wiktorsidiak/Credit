package com.inteca.Inteca.mapper;

import com.inteca.Inteca.model.Credit;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CreditMapper implements RowMapper<Credit> {
    @Override
    public Credit mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Credit credit = new Credit();
        credit.setCreditId((long) resultSet.getInt("credit_id"));
        credit.setCreditName(resultSet.getString("credit_name"));
        return credit;
    }
}
