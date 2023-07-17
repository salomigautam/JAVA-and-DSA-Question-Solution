package com.shalom;
import java.util.Scanner;
public class Program10_Currency {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter currency in rupees: ");
        float rupees=in.nextFloat();
//        float USD= (float) (rupees/80.5224);
//        System.out.println("currency in USD is : "+USD);
        float USD= (float) (rupees/80.5224);
        System.out.println("currency in USD is : "+USD);
    }
}
