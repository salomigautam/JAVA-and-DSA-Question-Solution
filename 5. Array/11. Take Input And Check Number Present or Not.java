package com.shalom;
import java.util.Arrays;
import java.util.Scanner;
public class Program130_InputAndCheckNOPresent {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] numbers=new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Enter the number to check the presence : ");
        int n=in.nextInt();
        boolean ans=false;

        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] == n) {
                ans=true;
                System.out.println("Present");
                break;
            }
            else{
                ans=false;
            }
        }
        if(!ans){// In place of if(ans==false){ we can write if(!ans){
            System.out.println("Not Present");
        }




    }
}
