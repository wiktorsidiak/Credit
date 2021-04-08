package com.inteca.Inteca.dao;

import com.inteca.Inteca.mapper.KredytMapper;
import com.inteca.Inteca.model.Kredyt;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Transactional
@Repository
@RequiredArgsConstructor
public class KredytDAOImpl implements KredytDAO {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void createCredit(Kredyt kredyt) {
        kredyt.setCreditId(kredyt.getCreditId());
        kredyt.setCreditName(kredyt.getCreditName());
        String SQLKredyt = "INSERT INTO credit (credit_id, credit_name) VALUES (?, ?)";
        jdbcTemplate.update(SQLKredyt, kredyt.getCreditId(), kredyt.getCreditName());
    }

    @Override
    public List<Kredyt> getCredits() {
        String SQL = "SELECT * FROM credit";
        RowMapper<Kredyt> kredytMapper = new KredytMapper();
        return jdbcTemplate.query(SQL, kredytMapper);
    }
}
