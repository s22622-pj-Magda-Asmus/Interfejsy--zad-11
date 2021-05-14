package com.company;
import java.util.Date;


public class PinEvent {

    private Safe safe;
    public Date eventDate = new Date();

    public PinEvent(Safe safe) {
        this.safe = safe;

    }
    public Safe getSafe(){
        return this.safe;
    }


}
