package com.RecursionAssignment;

public class Question7_Length_Of_String_Using_Recursion {
    public static void main(String[] args) {
        String name = "abcd";
        System.out.println(length(name));
    }
    static int length(String name){
        if(name.length() == 1){
            return 1;
        }
        return 1 + length(name.substring(1));
    }
}
