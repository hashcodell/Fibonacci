package com.picc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkManagerTest {

    @Test
    public void should_get_one_ticket_when_manager_park_one_car(){
        ParkBoy parkBoy = new ParkBoy(new ParkLot(2));
        CleverParkBoy cleverParkBoy = new CleverParkBoy(new ParkLot(2),new ParkLot(3));
        SuperParkBoy superParkBoy = new SuperParkBoy(new ParkLot(2),new ParkLot(3),new ParkLot(4));
        ParkManager parkManger = new ParkManager(new ArrayList(Arrays.asList(parkBoy,cleverParkBoy,superParkBoy)), new ArrayList(Arrays.asList(new ParkLot(2), new ParkLot(3))));
        Car car = new Car();
        ParkTicket parkTicket = parkManger.parkCar(car);
        assertEquals(car,parkManger.pickUpCar(parkTicket));
    }

    @Test
    public void should_get_one_ticket_when_manager_let_one_boy_park_one_car(){
        ParkBoy parkBoy = new ParkBoy(new ParkLot(2));
        CleverParkBoy cleverParkBoy = new CleverParkBoy(new ParkLot(2),new ParkLot(3));
        SuperParkBoy superParkBoy = new SuperParkBoy(new ParkLot(2),new ParkLot(3),new ParkLot(4));
        ParkManager parkManger = new ParkManager(new ArrayList(Arrays.asList(parkBoy,cleverParkBoy,superParkBoy)), new ArrayList(Arrays.asList(new ParkLot(2), new ParkLot(3))));
        Car car = new Car();
        ParkTicket parkTicket = parkManger.parkCar(car,"");
        assertEquals(car,parkBoy.getCar(parkTicket));
    }
}
