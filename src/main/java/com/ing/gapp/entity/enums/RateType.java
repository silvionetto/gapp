package com.ing.gapp.entity.enums;

public enum RateType {
    FIXED("Fixed"),
    FLOAT("Float");

    private final String type;

    RateType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
