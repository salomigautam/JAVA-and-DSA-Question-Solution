package com.shalom;
import java.util.Scanner;
public class Program63_AverageMarks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n=in.nextInt();
        System.out.println("enter the marks : ");
        int i=1;
        int totalmarks=0;
        while(i<=n){
            int marks=in.nextInt();
            totalmarks+=marks;
            i++;
        }
        System.out.println(totalmarks/n);


    }
}
