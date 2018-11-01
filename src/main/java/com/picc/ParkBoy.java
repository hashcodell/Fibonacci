package com.picc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkBoy {
    private List<ParkLot> parkLots = new ArrayList<ParkLot>();
    private int parkNumber;
    private int parkSetNumber;

    public ParkBoy(ParkLot... parklots) {
        this.parkLots = Arrays.asList(parklots);
        this.parkNumber = parkLots.size();
        for(ParkLot parkLot:parklots){
            this.parkSetNumber += parkLot.getSetNumber();
        }
    }

    public int getParkNumber() {
        return parkNumber;
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
            Car car = parkLot.parkUpCar(parkTicket);
            if(car != null) return car;
        }
        return null;
    }

    public int getSetNumber() {
        int setNumber = 0;
        for(ParkLot parkLot:parkLots){
            setNumber += parkLot.getSetNumber();
        }
        return setNumber;
    }

    public List<Integer> getFormDate() {
        int currentParksetNumber = 0;
        for(ParkLot parkLot:parkLots){
            currentParksetNumber += parkLot.getSetNumber();
        }
        List<Integer> formDateList = new ArrayList<Integer>(Arrays.asList(parkNumber,parkSetNumber));
        for(ParkLot parkLot:parkLots){
            formDateList.add(1);
        }
        return formDateList;
    }
}
