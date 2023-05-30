package com.jad;

import com.jad.parking.Parking;
import com.jad.vehicle.*;

public class Main {
    public static void main(final String[] args) {
        final Parkable car = new Twingo("Twingo");
        final Parkable motorBike = new Motorbike("Ma moto");
        final Parkable truck = new Car("Mon gros camion");
        final Parkable trash = new Trash();

        final Parking parking = new Parking();
        parking.receiveVehicle(car);
        parking.receiveVehicle(truck);
        parking.receiveVehicle(trash);
        parking.display();

    }
}