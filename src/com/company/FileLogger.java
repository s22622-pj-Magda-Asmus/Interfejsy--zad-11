package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.print.attribute.standard.Severity;

public class FileLogger implements Logger{

    public Severity logLevel;

    public void LogMessage(Severity dotkliwosc/*,EventSource zdarzenie*/,String komunikat) throws FileNotFoundException{
        File file = new File("logi.txt");
        PrintWriter zapis = new PrintWriter("logi.txt");
        zapis.println("Zdarzenie\n " + /*zdarzenie +*/ "\nPosiada poziom dotkliwości " + dotkliwosc + "\noraz komunikat " + komunikat );
        zapis.close();
    }
}
