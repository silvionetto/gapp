package com.ing.gapp.service;

import com.ing.gapp.entity.Overnight;
import com.ing.gapp.rowmapper.OvernightRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class OvernightService {
    private static final Logger LOGGER = Logger.getLogger(OvernightService.class.getName());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Persists or updates Overnight in the system. Also assigns an identifier
     * for new Overnight instances.
     *
     * @param entry
     */
    public synchronized void save(Overnight entry) {
        if (entry == null) {
            LOGGER.log(Level.SEVERE,
                    "Overnight is null. Are you sure you have connected your form to the application as described in tutorial chapter 7?");
            return;
        }

        try {
            entry = entry.clone();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        jdbcTemplate.update("Insert into TB_Overnight(bank, amount, rate, version) values (?, ?, ?, ?)",
                entry.getBank().getId(), entry.getAmount(), entry.getRate(), entry.getVersion());
    }

    /**
     * @return all available Overnight objects.
     */
    public synchronized List<Overnight> findAll() {
        return findAll("");
    }

    /**
     * Finds all Overnight's that match given filter.
     *
     * @param stringFilter filter that returned objects should match or null/empty string
     *                     if all objects should be returned.
     * @return list a Overnight objects
     */
    public synchronized List<Overnight> findAll(String stringFilter) {
        return jdbcTemplate.query("SELECT o.id, b.name as bank_name, o.amount, o.rate, o.version from TB_Overnight o, TB_Bank b where o.bank = b.id and b.name like ?",
                new Object[]{"%" + stringFilter + "%"}, new OvernightRowMapper());
    }
}
