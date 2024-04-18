package com.RecursionAssignment;

public class Question11_ProductOfTwoNumber {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        System.out.println(product(x, y));
    }

    static int product(int x, int y){
        if(x < y){
            return product(y, x);
        }
        if(y == 0){
            return 0;
        }
        return (x + product(x, y - 1));
    }
}
