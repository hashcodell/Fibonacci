package com.picc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuperParkBoyTest {
    @Test
    public void get_one_ticket_when_park_one_car_in_the_parking_lot(){
        Car car1 = new Car();
        Car car2 = new Car();
        ParkLot parklot1 = new ParkLot(3);
        ParkLot parkLot2 = new ParkLot(2);

        SuperParkBoy superParkBoy = new SuperParkBoy(parklot1, parkLot2);
        superParkBoy.parkingCar(car1);
        ParkTicket ticket = superParkBoy.parkingCar(car2);

        assertEquals(car2, parklot1.parkUpCar(ticket));
    }
}
