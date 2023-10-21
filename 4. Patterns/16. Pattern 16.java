package com.shalom;

//                    1
//                  1   1
//                1   2   1
//              1   3   3   1
//            1   4   6   4   1
public class Program199_pattern16 {
    public static void main(String[] args) {
        int n = 5;
        pattern16(n);
    }
    static void pattern16(int n){
        for(int row = 1; row <= n; row++){
            for(int spaces = 1; spaces <= n - row; spaces++){
                System.out.print(" ");
            }

            int x = 1;
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(x + " ");
                x = x * (row - cols)/cols;
            }
            System.out.println();

//            for(int cols = 1; cols <= row; cols++){
//                if(cols == 1 || cols == row){
//                    System.out.print("1 ");
//                } else if (cols == 2 || cols == row - 1) {
//                    System.out.print(row - 1 + " ");
//                }
//                else {
//                    System.out.print(row + 1 + " ");
//                }
//            }
//            System.out.println();
        }
    }
}
