package com.shalom;

//         *
//        **
//       ***
//      ****
//     *****


import java.util.function.DoubleToIntFunction;

public class Program189_pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n){
        for(int row = 1; row <= n; row++){
            // for spaces
            for(int spaces =1; spaces <= n-row;spaces++){
                System.out.print(" ");
            }
            for(int cols = 1; cols <= row; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
