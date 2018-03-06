package com.ing.gapp.rowmapper;

import com.ing.gapp.entity.Bank;
import com.ing.gapp.entity.Overnight;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OvernightRowMapper implements RowMapper<Overnight> {
    @Override
    public Overnight mapRow(ResultSet resultSet, int i) throws SQLException {
        Overnight overnight = new Overnight();
        overnight.setId(resultSet.getInt("id"));

        Bank bank = new Bank();
        bank.setId(resultSet.getInt("bank"));
        bank.setName(resultSet.getString("bank_name"));
        overnight.setBank(bank);

        overnight.setAmount(resultSet.getBigDecimal("amount"));
        overnight.setRate(resultSet.getFloat("rate"));
        overnight.setVersion(resultSet.getInt("version"));
        return overnight;
    }
}
