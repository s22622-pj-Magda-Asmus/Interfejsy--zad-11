package com.company;
import java.util.Date;

public class EventSource {

    private Safe xxx = new Safe();
    public Date eventDate;


    public EventSource(PinEvent a){
        this.eventDate= a.eventDate;
        this.xxx= a.getSafe();
   }

}
