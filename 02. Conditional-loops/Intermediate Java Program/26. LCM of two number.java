package com.shalom;
import java.util.Scanner;
public class Program71_LCMOfTwoNumber {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number : ");
        int n1=in.nextInt();
        System.out.println("enter the second number : ");
        int n2=in.nextInt();
        int i=1;
        int gcd=0;
        int LCM;
        while(i<=n1 || i<=n2){
            int res1=n1%i;
            int res2=n2%i;
            if(res1==0 && res2==0){
                gcd=i;
            }
            i++;
        }
        LCM=(n1*n2)/gcd;
        System.out.println(LCM);

    }
}
