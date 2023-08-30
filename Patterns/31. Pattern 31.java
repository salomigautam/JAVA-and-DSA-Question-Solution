package com.shalom;

//        a
//        B c
//        D e F
//        g H i J
//        k L m N o
public class Program217_pattern33 {
    public static void main(String[] args) {
        int n = 5;
        pattern33(n);
    }
    static void pattern33(int n) {
        int alphabet = 97;
        for(int row = 1; row <= n; row++) {
            for(int cols = 1; cols <= row; cols++) {
                if(alphabet % 2 != 0){
                    System.out.print((char)(alphabet) + " ");
                }
                else {
                    char letter = (char)(alphabet);
                    char capital = Character.toUpperCase(letter);
                    System.out.print(capital + " ");
                }
                alphabet++;
            }
            System.out.println();
        }
    }
}
