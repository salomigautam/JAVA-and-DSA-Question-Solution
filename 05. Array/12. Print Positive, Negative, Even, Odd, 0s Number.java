package com.shalom;
import java.util.Arrays;
import java.util.Scanner;
public class Program131_PrintPosNegEvenOdd0s {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] numbers=new int[20];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0) {
                System.out.println("Even numbers : " + numbers[i] + " ");
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2!=0){
                System.out.println("Odd numbers : "+numbers[i]+" ");
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                System.out.println("Positive numbers : "+numbers[i]+" ");
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                System.out.println("Negative numbers : "+numbers[i]+" ");
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                System.out.println("Os numbers : "+numbers[i]+" ");
            }
        }
    }
}
