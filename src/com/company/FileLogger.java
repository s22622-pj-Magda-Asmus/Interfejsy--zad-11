package com.company;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.print.attribute.standard.Severity;

public class FileLogger implements Logger{

    public Severity logLevel;

    public void LogMessage(Severity dotkliwosc,EventSource zdarzenie,String komunikat){
        try {
            FileWriter file = new FileWriter("logi.txt", true);
            PrintWriter zapis = new PrintWriter(file);
            zapis.println("Zdarzenie\n " + zdarzenie + "\nPosiada poziom dotkliwości " + dotkliwosc + "\noraz komunikat " + komunikat);
            zapis.close();
        }catch(Exception e){
            System.out.println("ten plik nie istnieje");
        }
    }
}
