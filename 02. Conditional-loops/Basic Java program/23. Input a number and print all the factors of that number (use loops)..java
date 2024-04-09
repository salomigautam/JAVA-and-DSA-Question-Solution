package com.shalom;
import java.util.Scanner;
public class Program36_Factors {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number to print all the factors of that number : ");
        int n=in.nextInt();
        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.print(+i+" ");
            }
            i++;
        }

    }
}
