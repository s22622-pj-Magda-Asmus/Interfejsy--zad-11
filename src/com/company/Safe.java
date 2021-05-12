package com.company;
import javax.print.attribute.standard.Severity;
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
        PinEvent event = new PinEvent();
        alarms.forEach(alarm -> alarm.alarmTurnOn(event));
        ConsoleLogger logger = new ConsoleLogger();
       // EventSource eventt = new EventSource(eventt);
        logger.LogMessage(Severity.ERROR,/* EventSource eventt,*/ "IJO IJO IJO");

    }

    private void correctPin() {
        alarms.forEach(alarm -> alarm.alarmTurnOff(new PinEvent()));
        ConsoleLogger logger = new ConsoleLogger();
        EventSource event = new EventSource();
        logger.LogMessage(Severity.REPORT,/* EventSource event,*/ "Wszystko OK, sejf otwarty");
    }


}
