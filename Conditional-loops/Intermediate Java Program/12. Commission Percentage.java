package com.shalom;
import java.util.Scanner;
public class Program57_CommissionPercentage {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the amount : ");
        double amount=in.nextDouble();
        System.out.println("enter the commission percentage : ");
        double commPer=in.nextDouble();
        double commission=(amount*commPer)/100;
//        double commission1=(amount/100)*commPer;
        System.out.println("commission amount will be : "+commission );
    }
}




//commissin=(amount*commPer)/100;
//commission=(amount/100)*commPer;
//commission=(commPer/100)*amount;..........all are right