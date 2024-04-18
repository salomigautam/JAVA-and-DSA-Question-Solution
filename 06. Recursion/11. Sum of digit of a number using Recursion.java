package com.RecursionAssignment;

import org.w3c.dom.ls.LSOutput;

public class Question10_sumOfDigitsOfNumber {
    public static void main(String[] args) {
        int num = 45632;

//        System.out.println(digitSum(num, 0));
        System.out.println(digitSum2(num));
    }

//    static int digitSum(int num, int ans){
//        if(num % 10 == num){
//            return ans + num;
//        }
//        ans += num % 10;
//        return digitSum(num / 10, ans);
//    }

    static int digitSum2(int num){
        if(num == 0){
            return 0;
        }
        return num % 10 + digitSum2(num / 10);
    }
}
