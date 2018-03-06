package com.ing.gapp.rowmapper;

import com.ing.gapp.entity.Currency;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyRowMapper implements RowMapper<Currency> {
    @Override
    public Currency mapRow(ResultSet resultSet, int i) throws SQLException {
        Currency currency = new Currency();
        currency.setId(resultSet.getInt("id"));
        currency.setName(resultSet.getString("name"));
        currency.setCode(resultSet.getString("code"));
        currency.setVersion(resultSet.getInt("version"));
        return currency;
    }
}
