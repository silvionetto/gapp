package com.ing.gapp.service;

import com.ing.gapp.entity.Bank;
import com.ing.gapp.rowmapper.BankRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @return all available Bank objects.
     */
    public synchronized List<Bank> findAll() {
        return findAll("");
    }

    /**
     * Finds all Bank's that match given filter.
     *
     * @param stringFilter filter that returned objects should match or null/empty string
     *                     if all objects should be returned.
     * @return list a Bank objects
     */
    public synchronized List<Bank> findAll(String stringFilter) {
        return jdbcTemplate.query("SELECT id, name, version from TB_Bank where name like ?",
                new Object[]{"%" + stringFilter + "%"}, new BankRowMapper());
    }
}
