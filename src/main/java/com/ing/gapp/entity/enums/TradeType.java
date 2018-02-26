package com.ing.gapp.entity.enums;

public enum TradeType {
    LOAN("Load"),
    DEPOSIT("Deposit");

    private final String name;

    TradeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
