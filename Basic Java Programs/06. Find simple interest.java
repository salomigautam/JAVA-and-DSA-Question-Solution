package com.shalom;
import java.util.Scanner;
public class Program7_SimpleInterest {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter principle amount: ");
        int amount=in.nextInt();
        System.out.println("enter time duration: ");
        int time=in.nextInt();
        System.out.println("enter rate of interest: ");
        int interest=in.nextInt();
        System.out.println("simple interest is "+(amount*time*interest)/100);
    }
}
