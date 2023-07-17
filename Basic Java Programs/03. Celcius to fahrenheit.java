package com.shalom;
import java.util.Scanner;
public class Program4_CelsiusTOFahrenheit {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a temperature in celsius: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9 / 5) + 32;
        System.out.print("temperature in fahrenheit is " + tempF);
    }


}
