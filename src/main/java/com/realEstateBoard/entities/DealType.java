package com.realEstateBoard.entities;

public enum DealType {

    SELL ("Продажа"),
    RENT ("Аренда");
    private String value;
    DealType (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
