package com.shalom;
import java.util.Scanner;
public class Program102_SumOfTwoNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the First number : ");
        int n1=in.nextInt();
        System.out.println("Enter the second number : ");
        int n2=in.nextInt();

        int total=sum(n1,n2);
        System.out.println(total);
    }
    static int sum(int n1,int n2){
        return n1+n2;
    }
}
