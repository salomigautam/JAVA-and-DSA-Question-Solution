package com.shalom;
import java.util.Scanner;
public class Program112_Leapyear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year to check whether the year is leap year or not : ");
        int year=in.nextInt();

        Leap(year);
    }
    static void Leap(int yr){
        if(yr%4==0 && yr%100!=0 || yr%400==0){
            System.out.println("Leap year ");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
