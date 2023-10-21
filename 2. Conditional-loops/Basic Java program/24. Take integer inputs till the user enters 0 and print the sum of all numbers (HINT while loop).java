//package com.shalom;
//import java.util.Scanner;
//
//public class Program37_SumAfter0 {
//    public static void main(String[]ags) {
//        Scanner in = new Scanner(System.in);
//        int sum=0;
//        System.out.println("enter the number :");
//        while (true) {
//            int n = in.nextInt();
//            sum=sum+n;
//            if (n == 0) {
//                System.out.println("sum is = "+sum);
//                break;
//            }

package com.shalom;
import java.util.Scanner;

public class Program37_SumAfter0 {

    public static void main(String[]ags) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("enter the number :");
        while (true) {
            int n = in.nextInt();
            sum=sum+n;
            if (n == 'X') {
                System.out.println("sum is = "+sum);
                break;
           }
        }


    }
}
