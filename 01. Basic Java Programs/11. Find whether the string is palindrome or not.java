package com.shalom;

public class Program12_palindromeString {
    public static void main(String[]args){
        String Orignal="mom";
        String reverse="";
        int Length=Orignal.length();
        for(int i=Length-1;i>=0;i--){
            reverse=reverse+Orignal.charAt(i);

        }
        if(Orignal.equals(reverse)){
            System.out.println("Given string is Palindrome");

        }
        else{
            System.out.println("Given String is not palindrome");
        }
    }
}
