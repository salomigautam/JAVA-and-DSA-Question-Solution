package com.RecursionAssignment;

public class Question12_PrimeOrNot {
    public static void main(String[] args) {
        int num = 22;
        System.out.println(primeOrNot(num, 2));
    }

//    static boolean primeOrNot(int num, int chk) {
//        if (chk <= 1) {
//            return true;
//        }
//        if (num % chk == 0) {
//            return false;
//        }
//        return primeOrNot(num, chk - 1);
//
//    }

    static boolean primeOrNot(int num, int chk) {
        if (num % chk == 0) {
            return false;
        }
        if (chk * chk > num) {
            return true;
        }
        return primeOrNot(num, chk + 1);

    }
}
