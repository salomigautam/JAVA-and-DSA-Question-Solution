package com.shalom;
import java.util.Arrays;
import java.util.Scanner;
public class Program129_StoreInput {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int size=10;
        int[] numbers=new int[size];

        for(int i=0;i<size;i++){
            numbers[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
