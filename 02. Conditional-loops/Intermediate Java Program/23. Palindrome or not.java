package com.shalom;
import java.util.Scanner;
public class Program68_PalindromeORNot {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=in.nextInt();
        String s=String.valueOf(n);
        String res="";
//        StringBuilder res= new StringBuilder();
        while(n>0){
            int rem=n%10;
            res+=rem;
//            res.append(rem);
            n=n/10;

        }
        System.out.println(res);

        if(res.equals(s)){
            System.out.println("given number is palindrome");
        }
        else {
            System.out.println("given number is not palindrome");
        }
    }
}
