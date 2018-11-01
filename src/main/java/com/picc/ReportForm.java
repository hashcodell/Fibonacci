package com.picc;

public class ReportForm {

  public StringBuffer printForm(ParkManager parkManager) {
    StringBuffer form = new StringBuffer();
    form.append(parkManager.getFormDate());
    return form;
  }
}
