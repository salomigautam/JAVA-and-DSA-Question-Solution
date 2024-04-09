package com.shalom;

//         1
//         0 1
//         1 0 1
//         0 1 0 1
//         1 0 1 0 1
public class Program205_pattern22 {
    public static void main(String[] args) {
        int n = 5;
        pattern22(n);
    }
    static void pattern22(int n ) {
        int num1 = 1;
        int num2 = 0;
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                if((row + cols) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
            }
        }
            System.out.println();
        }
    }
}

