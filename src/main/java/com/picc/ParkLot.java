package com.picc;

import java.util.HashMap;
import java.util.Map;

public class ParkLot {
    private int capatity;
    private Map<ParkTicket, Car> carMap = new HashMap<ParkTicket, Car>();

    public ParkLot(int capatity) {
        this.capatity = capatity;
    }

    public ParkTicket parkingCar(Car car) {
        ParkTicket parkTicket = new ParkTicket();
        if (this.capatity == carMap.size()) throw new ArrayIndexOutOfBoundsException("parking lot is full");
        carMap.put(parkTicket, car);
        return parkTicket;
    }

    public Map<ParkTicket, Car> getCarMap() {
        return carMap;
    }

    public Car parkUpCar(ParkTicket parkTicket) {
        Car car = carMap.get(parkTicket);
        carMap.remove(parkTicket);
        return car;
    }

    public boolean isfull() {
        if (carMap.size() == capatity) {
            return true;
        }
        return false;
    }

    public int getNullSeat() {
        return capatity - carMap.size();
    }


    public int getCapatity() {
        return capatity;
    }

    public double getVacancyRate() {
        return 1 - carMap.size() / capatity;
    }
}