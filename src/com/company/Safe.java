package com.company;
import java.util.ArrayList;
import java.util.List;


public class Safe {

    public List<Alarm> alarms = new ArrayList<>() ;

    private final String pin = "123";

   public Safe(){
   }


    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }
    public void removeAlarm(Alarm alarm) {
       alarms.remove(alarm);
    }

    public void enterPin (String proba) {
       if (proba.equals(pin)) {
           correctPin();
       }else{
           wrongPin();
       }
   }

    private void wrongPin() {
       alarms.forEach(alarm -> alarm.alarmTurnOn(new PinEvent()));

    }

    private void correctPin() {
        alarms.forEach(alarm -> alarm.alarmTurnOff(new PinEvent()));

    }


}
