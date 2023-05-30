package com.jad.parking;

import com.jad.vehicle.Parkable;

import java.util.ArrayList;

public class Parking {
    private final ArrayList<Parkable> vehicles = new ArrayList<>();

    public void receiveVehicle(final Parkable vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(final Parkable vehicle) {
        // lorsqu'on quitte le parking, on doit payer
        // cependant le montant du paiement dépend du type de véhicule
        // voiture : 5€
        // moto : 3.5€
        // camion : 8€
        // benne à ordures : 0€
        final double amount = switch (vehicle.getCategory()) {
            case CAR -> 5;
            case MOTORBIKE -> 3.5;
            case TRUCK -> 8;
            default -> 0;
        };
        vehicle.pay(amount);
        this.vehicles.remove(vehicle);
    }

    public void display() {
        for (final Parkable vehicle : this.vehicles) {
            System.out.println(vehicle.getName());
        }
    }
}
