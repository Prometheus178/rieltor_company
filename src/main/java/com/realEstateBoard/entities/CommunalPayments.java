package com.realEstateBoard.entities;

public enum CommunalPayments {
    YES ("да"),
    NO("нет");

    private String value;
    CommunalPayments (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
