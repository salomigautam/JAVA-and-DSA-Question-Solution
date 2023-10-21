package com.shalom;
import java.util.Scanner;
public class Program64_SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of N : ");
        int N=in.nextInt();
        int sum=0;
        int i=1;
        while(i<=N){
            sum+=i;
            i++;
        }
        System.out.println("sum is = "+sum);
    }
}
