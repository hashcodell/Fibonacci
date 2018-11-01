package com.picc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkManager {
  private List<ParkBoy> boyList;
  private List<ParkLot> parkingList;
  private int parkNumber;
  private int parkSetNumber;
  public ParkManager(List<ParkBoy> boyList, List<ParkLot> parkingList) {
    this.boyList = boyList;
    this.parkingList = parkingList;
    for(ParkBoy parkBoy:boyList){
      this.parkNumber += parkBoy.getParkNumber();
      this.parkSetNumber += parkBoy.getSetNumber();
    }
    for (ParkLot parkLot:parkingList){
      parkSetNumber += parkLot.getSetNumber();
    }
    this.parkNumber += parkingList.size();
  }

  public ParkTicket parkCar(Car car) {
    for (ParkLot parkLot:parkingList){
      if(!parkLot.isfull()){
        return parkLot.parkingCar(car);
      }
    }
    return null;
  }

  public ParkTicket parkCar(Car car, String boyParking) {
    for(ParkBoy parkBoy:boyList){
      ParkTicket parkTicket = parkBoy.parkingCar(car);
      if(parkTicket != null){
        return parkTicket;
      }
    }
    return null;
  }

  public Car pickUpCar(ParkTicket parkTicket) {
    for (ParkLot parkLot:parkingList){
      Car car = parkLot.parkUpCar(parkTicket);
      if(car != null) return car;
    }
    return null;
  }

  public Map<String, List<Integer>> getFormDate() {
    Map<String, List<Integer>> reportMap = new HashMap<>();
    int currentParksetNumber = 0;
    for(ParkLot parkLot:parkingList){
      currentParksetNumber += parkLot.getSetNumber();
    }
    reportMap.put("M1", new ArrayList<Integer>(Arrays.asList(parkNumber, parkSetNumber , parkingList.size(), currentParksetNumber)));
    for (ParkBoy parkBoy:boyList){
      reportMap.put("B1", parkBoy.getFormDate());
    }
    return reportMap;
  }


}
