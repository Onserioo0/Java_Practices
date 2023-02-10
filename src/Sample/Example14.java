package Sample;
//  Write a program which can be used to display a conversion table .e.g DegreesCelsius to Fahrenheit
//          Hints:
//      One variable is required
//      You need a loop
import  java.util.*;
import  java.lang.*;
import  java.io.*;
public class Example14 {

    public static void main(String[] args) {

        double temp, tempConverted, roundTempConverted;

        System.out.println("\t\tDegreeCelsius to Fahrenheit Conversion table");
        System.out.println("------------------------------------------------------------------");

        temp = 0;
        for (int i = 0; i <= 100; i++)
        {
            tempConverted = (temp * 1.8)+32;

            roundTempConverted = Math.round(tempConverted);

            System.out.println("\t\t" + temp + " C converted to (Metres) = " + roundTempConverted + " F");
            temp++;
        }

    }
}
