package com.shalom;
import java.util.Scanner;
public class Program73_SumOfDigits {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=in.nextInt();
        int rem;
        int sum=0;
        int i=1;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n=n/10;
            i++;
        }
        System.out.println(sum);
    }

}
