package com.jad.vehicle;

public class Truck extends Vehicle implements Parkable {
    public Truck(final String name) {
        super(name);
    }

    @Override
    public VehicleCategory getCategory() {
        return VehicleCategory.TRUCK;
    }

    @Override
    public void pay(final double amount) {

    }
}
