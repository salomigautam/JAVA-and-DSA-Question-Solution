package com.shalom;

//         *****
//         *****
//         *****
//         *****
//         *****
public class Program184_Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            for (int cols =1; cols <= n; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
