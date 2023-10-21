package com.shalom;
import java.util.Scanner;
public class Program119_SearchNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[] numbers= new int[size];
        //input
        for(int i=0;i<size;i++) {
            numbers[i] = in.nextInt();
        }
        //output
        int x=20;
        for(int i=0;i<numbers.length;i++){
                if(numbers[i]==x){
                    System.out.println("x found at index "+i);
                }
            }
        }
    }

