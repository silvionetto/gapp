package com.ing.gapp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Overnight extends BaseEntity<Overnight> {

    private Date overnightDate;
    private Bank bank;
    private BigDecimal amount;
    private Float rate;

    public Date getOvernightDate() {
        return overnightDate;
    }

    public void setOvernightDate(Date overnightDate) {
        this.overnightDate = overnightDate;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
}
