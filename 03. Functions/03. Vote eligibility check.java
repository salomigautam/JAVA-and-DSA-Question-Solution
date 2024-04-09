package com.shalom;
import java.util.Scanner;
public class Program101_VoteEligibilityMethod {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the age : ");
        int age=in.nextInt();
        String result=IsEligible(age);
        System.out.println(result);
    }
    static String IsEligible(int n){
        if(n>=18){
            return "Eligible for vote";
        }
        else{
            return "Not Eligible for vote";
        }
    }
}
