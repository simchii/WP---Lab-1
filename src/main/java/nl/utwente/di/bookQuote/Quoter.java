package nl.utwente.di.bookQuote;

import java.util.HashMap;
import java.util.Map;

public class Quoter{


    public Quoter(){

    }
    public double transformTemperature(String temp){
        return Double.parseDouble(temp) * 9/5 + 32;
    }
}
