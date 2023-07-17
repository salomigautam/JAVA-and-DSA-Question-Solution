
                    //using while loop
package com.shalom;
import java.util.Scanner;
public class Program2_PrimeNO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num1 = in.nextInt();
        int value = 0;
        int c = 2;
        while (c < num1) {
            if (num1 % c == 0) {
                value = 1;
                break;

            }
            c = c + 1;

        }
        if (value == 1) {
            System.out.println("Not prime number");
        } else {
            System.out.println("Prime number");
        }
    }
}

                //using for loop

//package com.shalom;
//
//        import java.util.Scanner;
//
//public class Program3_primeBySquareRootMethod {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter a number: ");
//        int num1 = in.nextInt();
//        int i;
//        int value = 0;
//        for (i = 2; i < num1; i++) {
//            if (num1 % i == 0) {
//                value = 1;
//                break;
//            }
//        }
//        if (value == 1) {
//            System.out.println("not prime");
//        } else {
//            System.out.println("prime");
//        }
//    }
//}
//





