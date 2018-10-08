package com.picc;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ParkBoyTest {
        @Test
        public void should_park_one_car_when_first_car_lot_is_not_full(){
            ParkLot parkLotFirst = new ParkLot(1);
            ParkLot parkLotSecond = new ParkLot(1);
            Car car = new Car();
            ParkBoy parkLotBoy = new ParkBoy(parkLotFirst, parkLotSecond);
            parkLotBoy.parkingCar(car);

            assertThat(parkLotFirst.isfull()).isEqualTo(true);
            assertThat(parkLotSecond.isfull()).isEqualTo(true);
        }

        @Test
        public void should_park_two_car_when_first_car_park_lot_is_full(){
            ParkLot parkLotFirst = new ParkLot(1);
            ParkLot parkLotSecond = new ParkLot(1);
            Car car1 = new Car();
            Car car2 = new Car();
            ParkBoy parkLotBoy = new ParkBoy(parkLotFirst, parkLotSecond);
            parkLotBoy.parkingCar(car1);
            parkLotBoy.parkingCar(car2);

            assertThat(parkLotFirst.isfull()).isEqualTo(true);
            assertThat(parkLotSecond.isfull()).isEqualTo(true);
        }

        @Test
        public void should_park_one_car_when_two_car_park_lot_is_full(){
            ParkLot parkLotFirst = new ParkLot(1);
            ParkLot parkLotSecond = new ParkLot(1);
            Car car1 = new Car();
            Car car2 = new Car();
            ParkBoy parkLotBoy = new ParkBoy(parkLotFirst, parkLotSecond);
            parkLotBoy.parkingCar(car1);
            parkLotBoy.parkingCar(car2);

            assertThat(parkLotFirst.isfull()).isEqualTo(true);
            assertThat(parkLotSecond.isfull()).isEqualTo(true);

        }

        @Test
        public void should_get_parked_car_with_ticket(){
            ParkLot parkLotFirst = new ParkLot(1);
            ParkLot parkLotSecond = new ParkLot(1);
            ParkBoy parkBoy = new ParkBoy(parkLotFirst, parkLotSecond);
            Car car = new Car();

            ParkTicket parkTicket = parkBoy.parkingCar(car);

            Assert.assertEquals(car, parkBoy.getCar(parkTicket));
        }



}
