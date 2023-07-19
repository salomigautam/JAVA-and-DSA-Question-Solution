package com.shalom;
import java.util.Scanner;
public class Program76_LeapYear {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the year to check is it leap year or not");
        int year=in.nextInt();
        if( year%4==0 && year%100!=0 || year%400==0){
                System.out.println("leap yr");
            }
            else{
                System.out.println("not leap year");
            }
    }
}
