package com.ing.gapp.entity.enums;

public enum TradeType {
    LOAN("Loan"),
    DEPOSIT("Deposit");

    private final String name;

    TradeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
