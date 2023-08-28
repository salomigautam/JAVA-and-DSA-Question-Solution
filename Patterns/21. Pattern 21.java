package com.shalom;

//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15
public class Program204_pattern21 {
    public static void main(String[] args) {
        int n = 5;
        pattern21(n);
    }
    static void pattern21(int n){
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
