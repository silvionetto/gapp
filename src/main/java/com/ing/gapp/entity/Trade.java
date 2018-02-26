package com.ing.gapp.entity;

import com.ing.gapp.entity.enums.RateType;
import com.ing.gapp.entity.enums.TradeType;

import java.math.BigDecimal;
import java.util.Date;

public class Trade extends BaseEntity {

    private TradeType tradeType;
    private Date enteredDate;
    private Currency tradeCurrency;
    private BigDecimal tradeAmount;
    private RateType rateType;
    private Date startDate;
    private Date endDate;

    public TradeType getTradeType() {
        return tradeType;
    }

    public void setTradeType(TradeType tradeType) {
        this.tradeType = tradeType;
    }

    public Date getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }

    public Currency getTradeCurrency() {
        return tradeCurrency;
    }

    public void setTradeCurrency(Currency tradeCurrency) {
        this.tradeCurrency = tradeCurrency;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public RateType getRateType() {
        return rateType;
    }

    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
