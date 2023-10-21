package com.shalom;
import java.util.Scanner;
public class Program59_DepreciationOfValue {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value : ");
        double val=in.nextDouble();
        System.out.println("enter the rate of depreciation in per annum : ");
        double rate=in.nextDouble();
        System.out.println("enter the time in years : ");
        double time=in.nextDouble();
        double DepOfVal=val*Math.pow((1-rate/100),time);
        System.out.println(DepOfVal);
    }
}
