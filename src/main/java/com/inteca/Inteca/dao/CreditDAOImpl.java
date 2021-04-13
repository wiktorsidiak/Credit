package com.inteca.Inteca.dao;

import com.inteca.Inteca.mapper.CreditMapper;
import com.inteca.Inteca.model.Credit;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Transactional
@Repository
@RequiredArgsConstructor
public class CreditDAOImpl implements CreditDAO {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void createCredit(Credit credit) {
        credit.setCreditId(credit.getCreditId());
        credit.setCreditName(credit.getCreditName());
        String SQLKredyt = "INSERT INTO credit (credit_id, credit_name) VALUES (?, ?)";
        jdbcTemplate.update(SQLKredyt, credit.getCreditId(), credit.getCreditName());
    }

    @Override
    public List<Credit> getCredits() {
        String SQL = "SELECT * FROM credit";
        RowMapper<Credit> kredytMapper = new CreditMapper();
        return jdbcTemplate.query(SQL, kredytMapper);
    }
}
