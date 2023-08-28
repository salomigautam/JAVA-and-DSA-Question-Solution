package com.shalom;

//        1 1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3
//        4 4 4
//        5 5
//        6
public class Program209_pattern26 {
    public static void main(String[] args) {
        int n = 6;
        pattern26(n);
    }
    static void pattern26(int n ){
        for (int row = 1; row <= n; row++){
            for(int cols = 0; cols <= n - row; cols++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
