package com.shalom;
import java.util.Scanner;
//public class Program67_ReverseString {
//    public static void main(String[]args){
//        Scanner in=new Scanner(System.in);
//        String s=in.next();
//        int Length=s.length();
//        String reverse="";
//        for(int i=Length-1;i>=0;i--){
//            reverse+=s.charAt(i);
//        }
//        System.out.println(reverse);
//
//    }
//}


public class Program67_ReverseString {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=in.next();
        int Length=s.length();
        System.out.println(Length);
        StringBuilder reverse= new StringBuilder();
        for(int i=Length-1;i>=0;i--){
            reverse.append(s.charAt(i));
        }
        System.out.println(reverse);

    }
}
