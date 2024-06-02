package com.ak.patrol_pump;

import java.util.Date;

class Transaction {
    private String fuelType;
    private double quantity;
    private Date date;

    public Transaction(String fuelType, double quantity, Date date) {
        this.fuelType = fuelType;
        this.quantity = quantity;
        this.date = date;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" + "fuelType='" + fuelType + '\'' + ", quantity=" + quantity + ", date=" + date + '}';
    }
}
