package com.ing.gapp.rowmapper;

import com.ing.gapp.entity.Bank;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankRowMapper implements RowMapper<Bank> {

    @Override
    public Bank mapRow(ResultSet resultSet, int i) throws SQLException {
        Bank bank = new Bank();
        bank.setId(resultSet.getInt("id"));
        bank.setName(resultSet.getString("name"));
        bank.setVersion(resultSet.getInt("version"));
        return bank;
    }
}
