package com.shalom;

//        *****
//        ****
//        ***
//        **
//        *
public class Program190_pattern7 {
    public static void main(String[] args) {
        int n=5;
        pattern7(n);
    }

    static void pattern7(int n){
        for(int row = 1; row <= n; row++){
            for(int cols = 1; cols <= n - row + 1; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
