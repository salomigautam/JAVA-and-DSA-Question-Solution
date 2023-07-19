package com.shalom;
import java.util.Scanner;
public class Program48_FibonacciNumber {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int count = 2;
        int c = 0;
        while (count <= n) {
            c = a + b;
            a = b;
            b = c;
            count++;
        }
        System.out.println(c);
    }
}


//public class Program48_FibonacciNumber {
//    public static void main(String[]args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int n = in.nextInt();
//        int count = 2;
//        while (count <= n) {
//            int temp=b;
//            b=b+a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
//    }
//}
