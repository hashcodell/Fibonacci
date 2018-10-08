package com.picc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkBoy {
    List<ParkLot> parkLots = new ArrayList<ParkLot>();

    public ParkBoy(ParkLot... parklots) {

        this.parkLots = Arrays.asList(parklots);
    }

    public ParkTicket parkingCar(Car car) {
        for (ParkLot parkLot : this.parkLots) {
            if (!parkLot.isfull()) {
                return parkLot.parkingCar(car);
            }
        }
        return null;
    }

    public Car getCar(ParkTicket parkTicket) {
        for (ParkLot parkLot : parkLots) {
            if (parkLot.isfull()) {
                return parkLot.parkUpCar(parkTicket);
            }
        }
        return null;
    }

}
