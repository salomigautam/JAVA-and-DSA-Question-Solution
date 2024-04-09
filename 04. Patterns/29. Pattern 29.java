package com.shalom;

//        E
//        D E
//        C D E
//        B C D E
//        A B C D E
public class Program214_pattern32 {
    public static void main(String[] args) {
        int n = 5;
        pattern32(n);
    }
    static void pattern32(int n){
        int alphabet = 70;
        for(int row = 1; row <= n; row++) {
            for(int cols = row; cols >= 1; cols--) {
                char letter = ((char) (alphabet - cols));
                System.out.print(letter + " ");
            }

            System.out.println();
        }
    }
}
