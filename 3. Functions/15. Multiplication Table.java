package com.shalom;
import java.util.Scanner;
public class Program114_MultiplicationTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=in.nextInt();
          multiplication(n);
//        int table=multiplication(n);
//        System.out.println("Table of n is : "+table);
    }

//    static int multiplication(int number){
//        int i=1;
//        int ans;
//        while(i<=10){
//            ans=number*i;
//            i++;
//
//        }
//        return ans;
//    }
//}

//static void multiplication(int n){
//        for(int i=1;i<=10;i++){
//            int ans=n*i;
//            System.out.println(ans);
//
//        }
//    }
//}

static void multiplication(int n){
        int i=1;
        while(i<=10){
            int ans=n*i;
            System.out.println(ans);
            i++;

        }
    }
}