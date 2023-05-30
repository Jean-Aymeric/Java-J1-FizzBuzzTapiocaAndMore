package com.jad.vehicle;

public class Car extends Vehicle implements Parkable {
    public Car(final String name) {
        super(name);
    }

    @Override
    public VehicleCategory getCategory() {
        return VehicleCategory.CAR;
    }

    @Override
    public void pay(final double amount) {

    }
}
