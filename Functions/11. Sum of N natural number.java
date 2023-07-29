package com.shalom;
import java.util.Scanner;
public class Program109_SumOfNNaturalNUmber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to print the sum of them : ");
        int n=in.nextInt();

        int result=sum(n);
        System.out.println(result);

    }
    static int sum(int num){
        int i=1;
        int ans=0;
        while(num>=i){
             ans+=i;
             i++;

        }
        return ans;
    }
}
