package com.shalom;
import java.util.Scanner;
public class Program107_Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=in.nextInt();

        int result=factorial(n);
        System.out.println(result);
    }
    static int factorial(int n){
        int ans=1;
        for(int i=n;i>=1;i--){
            ans=ans*n;
        }
        return ans;

    }
}
