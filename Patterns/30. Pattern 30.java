package com.shalom;

//        E D C B A
//        D C B A
//        C B A
//        B A
//        A
public class Program215_pattern34 {
    public static void main(String[] args) {
        int n = 5;
        pattern35(n);
    }
    static void pattern35(int n) {
        int alphabet = 69;
        for (int row = 0; row < n; row++){
            for (int cols = 0; cols < n - row; cols++) {
                char letter = (char)(alphabet - cols - row);
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
}
