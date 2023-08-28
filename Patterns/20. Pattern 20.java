package com.shalom;

import com.sun.security.jgss.GSSUtil;

//        ****
//        *  *
//        *  *
//        *  *
//        ****
public class Program203_pattern20 {
    public static void main(String[] args) {
        int n = 5;
        pattern20(n);
    }
    static void pattern20(int n){
        for (int row = 1; row <= n ; row++) {
            for (int cols = 1; cols <= 4; cols++) {
                if(row == 1 || row == n){
                    System.out.print("*");
                }
                else if(cols ==1 || cols == 4){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
