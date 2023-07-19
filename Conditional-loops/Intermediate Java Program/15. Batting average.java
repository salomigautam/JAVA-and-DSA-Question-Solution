package com.shalom;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Program60_BattingAverage {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the total matches : ");
        int matches=in.nextInt();
        System.out.println("enter the innings: ");
        int innings=in.nextInt();
        System.out.println("enter the runs : ");
        int runs=in.nextInt();
        System.out.println("enter the out or dismissed number : ");
        int dismissed=in.nextInt();
        double Average=runs/dismissed;
        System.out.println("Batting Average = "+Average);
    }
}
