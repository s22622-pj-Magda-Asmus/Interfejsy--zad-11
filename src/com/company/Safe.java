package com.company;
import javax.print.attribute.standard.Severity;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;


public class Safe  {
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

    //metoda sprawdzająca czy odano odpowiedni pin i decydująca co wywoła sie dalej
    public void enterPin (String proba) {
       if (proba.equals(pin)) {
           correctPin();
       }else{
           wrongPin();
       }
   }

   //seria zdarzeń po wpisaniu złego pinu przez użytkownika
    private void wrongPin() {
        PinEvent event = new PinEvent(this);
        alarms.forEach(alarm -> alarm.alarmTurnOn(event));
        ConsoleLogger logger = new ConsoleLogger();
        FileLogger file = new FileLogger();
        EventSource source = new EventSource(event);
        logger.LogMessage(Severity.ERROR, source, "IJO IJO IJO, POLICJA już jedzie");
        file.LogMessage(Severity.ERROR, source, "IJO IJO IJO, POLICJA już jedzie");
    }

    //seria zdarzeń po wpisaniu dobrego pinu przez użytkownika
    private void correctPin() {
        PinEvent event = new PinEvent(this);
        alarms.forEach(alarm -> alarm.alarmTurnOff(event));
        ConsoleLogger logger = new ConsoleLogger();
        FileLogger file = new FileLogger();
        EventSource source = new EventSource(event);
        logger.LogMessage(Severity.REPORT, source, "Wszystko OK, sejf otwarty");
        file.LogMessage(Severity.REPORT, source, "Wszystko OK, sejf otwarty");

    }


}
