package com.company;
import java.util.*;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException{

        String pinWpisany;
        //Pobieranie pinu od użytkownika
        Scanner odczyt = new Scanner(System.in);
        boolean koniec = false;

        //Petla która pozwala wielokrotnie wprowadzać pin , lub wyłaczyć program za pomocą "stop"
        do {
            System.out.println("\nWprowadz PIN ");
            pinWpisany = odczyt.nextLine();

            if (pinWpisany.equals("stop"))
                koniec = true;

            else {
                Safe numer1 = new Safe();
                SoundAlarm dzwiekowy = new SoundAlarm();
                numer1.addAlarm(dzwiekowy);
                numer1.enterPin(pinWpisany);
               // numer1.zapis.close();
            }
        }
        while (!koniec);

        System.out.println("Koniec programu");
    }
}