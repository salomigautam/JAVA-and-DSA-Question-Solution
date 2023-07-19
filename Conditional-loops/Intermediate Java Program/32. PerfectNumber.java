package com.shalom;
import java.util.Scanner;
public class Program77_PerfectNumber {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=in.nextInt();
        int ans=0;
        int i=1;
        while(i<num){
            int res=num%i;
            if(res==0){
                ans+=i;
            }
            i++;
        }
        if(ans==num){
            System.out.println("given number "+num+" is perfect number");
        }
        else{
            System.out.println("given number "+num+" is not perfect number");
        }

    }
}
