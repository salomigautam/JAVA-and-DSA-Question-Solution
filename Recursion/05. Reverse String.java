package com.RecursionAssignment;

public class Question5_reverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
//        reverseString(s);

        int start = 0;
        int end = s.length - 1;

        helper(s, start, end);


    }

//    static void reverseString(char[] s) {
//        int start = 0;
//        int end = s.length - 1;
//        while(start <= end){
//            char temp = s[start];
//            s[start] = s[end];
//            s[end] = temp;
//            start++;
//            end--;
//        }
//
//        System.out.println(s);
//    }



//    static void reverseString(char[] s) {
//        for(int i = 0; i < s.length / 2; i++){
//            char temp = s[i];
//            s[i] = s[s.length - 1 - i];
//            s[s.length - 1 - i] = temp;
//        }

//        System.out.println(s);
//    }

    static void helper(char[] s, int start, int end){
        if(start >= end){
            System.out.println(s);
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        helper(s, start + 1, end - 1);
    }
}
