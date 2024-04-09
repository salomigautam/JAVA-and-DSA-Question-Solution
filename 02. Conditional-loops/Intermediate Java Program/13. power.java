package com.shalom;
import java.util.Scanner;
public class Program58_power {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=in.nextInt();
        System.out.println("enter the power of number : ");
        int power=in.nextInt();
        long answer=1;
        int i=1;
        while(i<=power){
            answer*=n;
            i++;
        }
        System.out.println(+n+" to the power "+power+"="+answer);

    }
}
