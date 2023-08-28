package com.shalom;

//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
public class Program188_pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n){
        for(int row = 1; row <= 2 * n-1; row++){

            int totalColumns;
            if(row > n){
                totalColumns = 2 * n - row;
            }
            else{
                totalColumns=row;
            }

            for(int cols = 1; cols <= totalColumns; cols++){
                System.out.print("*");
            }
            System.out.println();
        }

        // In Short
        // not getting this for loop range given by kunal

//        for (int row = 0; row < 2 * n; row++) {
//            int totalColsInRow = row > n ? 2 * n - row: row;
//            for (int col = 0; col < totalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}

