package com.company;

import javax.print.attribute.standard.Severity;

public class SoundAlarm implements Alarm{


    @Override
    public void alarmTurnOff(PinEvent a) {
        //System.out.println("Sejf otwarty");
    }

    @Override
    public void alarmTurnOn(PinEvent a) {
       // System.out.println("ijo ijo ijo");
    }
}
