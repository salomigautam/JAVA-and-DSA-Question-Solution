package com.shalom;
import java.util.Scanner;
public class Program113_Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int n1=in.nextInt();
        int n2=in.nextInt();

        System.out.println(sum(n1,n2));
    }
    static int sum(int num1,int num2){
        return num1+num2;
    }

}
