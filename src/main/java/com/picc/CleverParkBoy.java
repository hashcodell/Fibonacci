package com.picc;


public class CleverParkBoy extends ParkBoy {

    public CleverParkBoy(ParkLot parkLotFirst, ParkLot parkLotSecond) {
        super(parkLotFirst, parkLotSecond);
    }

    @Override
    public ParkTicket parkingCar(Car car) {

        ParkLot tempParkLot = new ParkLot(0);
        for (ParkLot parkLot : parkLots) {
            if (tempParkLot.getNullSeat() < parkLot.getNullSeat()) {
                tempParkLot = parkLot;
            }
        }


        return tempParkLot.parkingCar(car);

    }

}
