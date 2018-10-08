package com.picc;

import java.util.Comparator;

public class SuperParkBoy extends ParkBoy {

    public SuperParkBoy(ParkLot... parklots) {
        super(parklots);
    }

    @Override
    public ParkTicket parkingCar(Car car) {
        parkLots.sort(Comparator.comparingDouble(ParkLot::getVacancyRate));
        ParkLot parkLot = parkLots.get(0);
        return parkLot.parkingCar(car);
    }
}
