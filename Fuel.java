package com.ak.patrol_pump;


class Fuel {
    private String type;
    private double quantity;

    public Fuel(String type, double quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fuel{" + "type='" + type + '\'' + ", quantity=" + quantity + '}';
    }
}
