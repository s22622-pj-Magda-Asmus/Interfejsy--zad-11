package com.company;

import javax.print.attribute.standard.Severity;

public class ConsoleLogger implements Logger{

    public Severity logLevel;

    public ConsoleLogger(){
    }

    public void LogMessage(Severity dotkliwosc, EventSource zdarzenie , String komunikat) {
        System.out.println("Zdarzenie : " + zdarzenie + "\nPosiada poziom dotkliwości:  " + dotkliwosc + "\nOraz komunikat:  " + komunikat );
    }

}
