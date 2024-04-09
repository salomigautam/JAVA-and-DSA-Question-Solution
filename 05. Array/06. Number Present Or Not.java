package com.shalom;
import java.util.Scanner;
public class Program125_NumberPresentOrNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[] numbers=new int[size];

        for(int i=0;i<size;i++){
            numbers[i]=in.nextInt();
        }

        System.out.println("enter the number to search : ");
        int n=in.nextInt();
        boolean ans=false;
        for(int i=0;i<size;i++){
            if(n==numbers[i]){
                ans=true;
                System.out.println("present");
                break;
            }
            else{
                ans=false;
            }

        }
        if(ans==false){
            System.out.println("not present");
        }

    }
}
