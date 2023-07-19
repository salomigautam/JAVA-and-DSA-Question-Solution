package com.shalom;
import java.util.Scanner;
public class Program75_SumOfNegPosiEvenPosiOdd {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n;
        int evensum=0;
        int oddsum=0;
        int negsum=0;
        while(true){
            System.out.println("enter the number : ");
            n=in.nextInt();
            if(n==0){
                break;
            }
            if(n%2==0 && n>=0){
                evensum+=n;
            }
            if(n%2!=0 && n>=0){
                oddsum+=n;
            }
            if(n<0){
                negsum+=n;
            }
        }
        System.out.println("sum of even numbers = "+evensum);
        System.out.println("sum of odd numbers = " +oddsum);
        System.out.println("sum of negative numbers = "+negsum);


    }
}


