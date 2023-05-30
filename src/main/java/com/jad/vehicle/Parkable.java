package com.jad.vehicle;

public interface Parkable {
    String getName();

    VehicleCategory getCategory();

    void pay(double amount);
}
