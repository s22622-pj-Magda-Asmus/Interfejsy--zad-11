package com.company;
import java.awt.event.PaintEvent;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        //Pobieranie pinu od użytkownika
        Scanner in = new Scanner(System.in);
        String pinWpisany = in.nextLine();

//        //stworzenie obiektu klasy PinEvent z pinem przekazywanym przez użytkownika
//        PinEvent pin1 = new PinEvent(pinWpisany);
//        System.out.println(pin1.getSafe());


        Safe numer1 = new Safe();
        SoundAlarm dzwiekowy = new SoundAlarm();
        numer1.addAlarm(dzwiekowy);
        numer1.enterPin(pinWpisany);
//        numer1.addAlarm(poiuy);


//        // stworzenie liczby int na podstawie przekazanego prez użytkownika Stringu
//         int pinLiczbowy = Integer.parseInt(pinWpisany);
//        System.out.println(pinLiczbowy);





    }
}