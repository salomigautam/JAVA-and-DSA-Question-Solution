package com.shalom;
import com.sun.jdi.CharValue;

import java.util.Scanner;
public class Program72_VowelsConsonants {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the alphabet : ");
        char al=in.next().charAt(0);
//        String s= String.valueOf(al);
//        if(s.equals("a")|| s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") ) {
//            System.out.println("vowel");
//        }
//        else{
//            System.out.println("consonant");
//        }
        if(al=='a' || al=='e' || al=='i' || al=='o' || al=='u') {
            System.out.println("vowels");
        }
        else{
            System.out.println("consonants");
        }
    }
}
