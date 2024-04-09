package com.shalom;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Program62_CompoundInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the principle amount : ");
        double P=in.nextDouble();
        System.out.println("enter the rate of interest : ");
        double R=in.nextDouble();
        System.out.println("enter the time duration : ");
        double T=in.nextDouble();
        double CI=P*(Math.pow((1+R/100),T))-P;
        System.out.println(CI);
    }
}
