package com.picc;

public class ParkDirector {
  private ParkManager parkManager;
  private ReportForm reportForm;

  public ParkDirector(ParkManager parkManger) {
    this.parkManager = parkManger;
    reportForm = new ReportForm();
  }

  public void getForm() {
    reportForm.printForm(parkManager);
  }
}
