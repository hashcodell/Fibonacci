package com.picc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParkLotTest {

    @Test
    public void should_get_ticket_when_parking_one_car() {
        ParkLot parkLot = new ParkLot(1);

        ParkTicket ticket = parkLot.parkingCar(new Car());

        assertNotNull(ticket);
    }

    @Test
    public void should_throw_full_exception_when_lot_is_full() {
        ParkLot parkLot = new ParkLot(0);

        assertThrows( IndexOutOfBoundsException.class,() ->parkLot.parkingCar( new Car() ) );

    }

    @Test
    public void should_get_indicate_car_when_parking_one_car(){
        ParkLot parkLot = new ParkLot(2);
        Car car = new Car();
        ParkTicket parkTicket = parkLot.parkingCar(car);

        assertEquals(car, parkLot.parkUpCar(parkTicket));
    }

    @Test
    public void should_park_one_car_when_pick_a_car_from_full_parking_lot(){
        ParkLot parkLot = new ParkLot(2);
        Car car1 = new Car();
        Car car2 = new Car();
        ParkTicket parkTicket1 = parkLot.parkingCar(car1);
        ParkTicket parkTicket2 = parkLot.parkingCar(car2);

        parkLot.parkUpCar(parkTicket1);
    }


}
