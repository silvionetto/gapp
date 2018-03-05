package com.ing.gapp.service;

import com.ing.gapp.entity.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class TradeService {
    private static final Logger LOGGER = Logger.getLogger(TradeService.class.getName());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Persists or updates User in the system. Also assigns an identifier
     * for new User instances.
     *
     * @param entry
     */
    public synchronized void save(Trade entry) {
        if (entry == null) {
            LOGGER.log(Level.SEVERE,
                    "Trade is null. Are you sure you have connected your form to the application as described in tutorial chapter 7?");
            return;
        }
        try {
            entry = (Trade) entry.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
        jdbcTemplate.update("Insert into TB_Trade(type, user_password, version) values (?, ?, ?, ?)",
                entry.getId(), entry.getTradeType(), entry.getTradeCurrency(), entry.getVersion());
    }
}
