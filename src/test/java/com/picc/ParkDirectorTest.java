package com.picc;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class ParkDirectorTest {
  @Test
  public void get_one_form_about_parklot(){
    ParkBoy parkBoy = new ParkBoy(new ParkLot(2));
    CleverParkBoy cleverParkBoy = new CleverParkBoy(new ParkLot(2),new ParkLot(3));
    SuperParkBoy superParkBoy = new SuperParkBoy(new ParkLot(2),new ParkLot(3),new ParkLot(4));
    ParkManager parkManger = new ParkManager(new ArrayList(Arrays.asList(parkBoy,cleverParkBoy,superParkBoy)), new ArrayList(Arrays.asList(new ParkLot(2), new ParkLot(3))));
    ParkDirector parkDirector = new ParkDirector(parkManger);
    parkDirector.getForm();
  }
}
