package com.company;
import java.util.Date;
import java.util.List;

public class PinEvent {

    private Safe safe = new Safe();
    public Date eventDate = new Date();

    public PinEvent(){

    }

    public Safe getSafe(){
        return this.safe;
    }


}
