package com.picc;


import org.junit.Assert;
import org.junit.Test;

public class CleveParkBoyTest {

    @Test
    public void should_get_ticket_when_park_car_in_most_seat_park_lot(){
        ParkLot parkLotFirst = new ParkLot(2);
        ParkLot parkLotSecond = new ParkLot(2);
        CleverParkBoy cleverParkBoy = new CleverParkBoy(parkLotFirst, parkLotSecond);
        Car car = new Car();

        ParkTicket parkTicket = cleverParkBoy.parkingCar(car);

        Assert.assertEquals(1,parkLotFirst.getCarMap().size());
    }


}
