package com.shalom;
import java.util.Scanner;
public class Program66_NcrANDNpr {
    public  static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the total number of objects:  ");
        int n=in.nextInt();
        System.out.println("enter the number of object to be chosen out of objects : ");
        int r=in.nextInt();
        int sub=n-r;
        int ans=1;
        int ans2=1;
        int ans3=1;
        while(n>0){
            ans*=n;
            n--;
        }

        while(sub>0){
            ans2*=sub;
            sub--;
        }

        while (r > 0) {
            ans3*=r;
            r--;
        }
        int res1=ans/ans2;
        int res2=res1/ans3;
        System.out.println("NPR = "+res1);
        System.out.println("NCR = "+res2);
    }
}

