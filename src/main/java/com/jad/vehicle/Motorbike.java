package com.jad.vehicle;

public class Motorbike extends Vehicle implements Parkable {
    public Motorbike(final String name) {
        super(name);
    }

    @Override
    public VehicleCategory getCategory() {
        return VehicleCategory.MOTORBIKE;
    }

    @Override
    public void pay(final double amount) {

    }
}
