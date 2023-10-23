package com.shalom;
import java.util.Arrays;
import java.util.Scanner;
public class Program132_PrintNosOfNegPosEvenOdd0s {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] numbers=new int[20];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int sum1=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0) {
                sum1 = sum1 + 1;
            }
        }
        System.out.println("Even numbers : "+sum1);

        int sum2=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2!=0){
                sum2 = sum2 + 1;
            }
        }
        System.out.println("Odd numbers : "+sum2);

        int sum3=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                sum3=sum3+1;
            }
        }
        System.out.println("Positive numbers : "+sum3);

        int sum4=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                sum4=sum4+1;
            }
        }
        System.out.println("Negative numbers : "+sum4);

        int sum5=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                sum5=sum5+1;
            }
        }
        System.out.println("Os numbers : "+sum5);
    }
}
