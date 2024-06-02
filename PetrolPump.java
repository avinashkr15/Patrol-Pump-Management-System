package com.ak.patrol_pump;

import java.util.ArrayList;
import java.util.Date;

class PetrolPump {
    private ArrayList<Fuel> fuels;
    private ArrayList<Transaction> transactions;

    public PetrolPump() {
        this.fuels = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addFuel(Fuel fuel) {
        for (Fuel f : fuels) {
            if (f.getType().equalsIgnoreCase(fuel.getType())) {
                f.setQuantity(f.getQuantity() + fuel.getQuantity());
                return;
            }
        }
        fuels.add(fuel);
    }

    public boolean requestFuel(String type, double quantity, Date date) {
        for (Fuel f : fuels) {
            if (f.getType().equalsIgnoreCase(type) && f.getQuantity() >= quantity) {
                f.setQuantity(f.getQuantity() - quantity);
                transactions.add(new Transaction(type, quantity, date));
                return true;
            }
        }
        return false;
    }

    public ArrayList<Transaction> getTransactionsBetween(Date startDate, Date endDate) {
        ArrayList<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions) {
            if (!t.getDate().before(startDate) && !t.getDate().after(endDate)) {
                result.add(t);
            }
        }
        return result;
    }

    public ArrayList<Fuel> getFuels() {
        return fuels;
    }

    @Override
    public String toString() {
        return "PetrolPump{" + "fuels=" + fuels + ", transactions=" + transactions + '}';
    }
}
