package com.shalom;
import java.util.Scanner;
public class Program69_FutureInvestmentValue {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the amount : ");
        double P=in.nextDouble();
        System.out.println("enter the rate of interest : ");
        double R=in.nextDouble();
        System.out.println("enter the time of years : ");
        double T=in.nextDouble();
        double FIV=P*Math.pow((1+R/100),T);
        System.out.println("FIV = "+FIV);
    }
}
