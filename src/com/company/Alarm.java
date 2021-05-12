package com.company;

public interface Alarm {

    public ConsoleLogger logger = new ConsoleLogger()  ;



    public void alarmTurnOn(PinEvent a);
    public void alarmTurnOff(PinEvent a);



}
