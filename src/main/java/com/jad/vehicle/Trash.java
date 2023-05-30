package com.jad.vehicle;

public class Trash implements Parkable {
    @Override
    public String getName() {
        return "Benne à ordures";
    }

    @Override
    public VehicleCategory getCategory() {
        return VehicleCategory.OTHER;
    }

    @Override
    public void pay(final double amount) {

    }
}
