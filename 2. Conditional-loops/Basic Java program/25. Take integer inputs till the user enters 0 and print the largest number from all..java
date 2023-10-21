package com.shalom;
import java.util.Scanner;
public class Program38_LargestNoAfter0 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int largest=0;
        System.out.println("enter the numbers : ");
        while(true){
            int n=in.nextInt();
            if(n>largest){
                largest=n;
            }
            if(n==0){
                System.out.println("largest number is : "+largest);
                break;
            }
        }
    }
}
