package com.shalom;
import java.util.Scanner;
public class Program49_CountingOccurence {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number : ");
        int Fn=in.nextInt();
        System.out.println("enetr second number : ");
        int Sn=in.nextInt();
        int count=0;
        while(Fn>0){
            int rem=Fn%10;
            if(rem==Sn){
                count++;
            }
            Fn=Fn/10;
        }
        System.out.println(count);

    }
}
