package com.shalom;
import java.util.Scanner;
public class Program53_ElectricityBill {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        long units;
        double bill=0;
        System.out.println("enter the units to calculate the bill : ");
        units=in.nextLong();
        if(units<100){
            bill=units*1.20;
        }
        else if(units<300){
            bill=100*1.20+(units-100)*2;
        }
        else if (units>300) {
            bill=100*1.20+200*2+(units-300)*3;
        }
        System.out.println("Bill to pay : "+bill);
    }

}
