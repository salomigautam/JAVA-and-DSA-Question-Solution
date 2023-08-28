package com.shalom;

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
public class Program187_pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int cols = 1; cols <= row; cols++){
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
