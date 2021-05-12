package com.company;

import javax.print.attribute.standard.Severity;
import java.io.FileNotFoundException;

public interface Logger {

        public Severity logLevel = Severity.ERROR ;


        public void LogMessage(Severity dotkliwosc/*,EventSource zdarzenie*/,String komunikat) throws FileNotFoundException;

}
