package com.ing.gapp.service;

import com.ing.gapp.entity.Currency;
import com.ing.gapp.rowmapper.CurrencyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CurrencyService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @return all available Currency objects.
     */
    public synchronized List<Currency> findAll() {
        return findAll("");
    }

    /**
     * Finds all Currency's that match given filter.
     *
     * @param stringFilter filter that returned objects should match or null/empty string
     *                     if all objects should be returned.
     * @return list a Currency objects
     */
    public synchronized List<Currency> findAll(String stringFilter) {
        return jdbcTemplate.query("SELECT id, name, code, version from TB_Currency where name like ?",
                new Object[]{"%" + stringFilter + "%"}, new CurrencyRowMapper());
    }
}
