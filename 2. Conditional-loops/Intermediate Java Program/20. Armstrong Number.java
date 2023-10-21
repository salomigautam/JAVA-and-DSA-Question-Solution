package com.shalom;
import java.util.Scanner;
//public class Program65_ArmstrongNumber {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the number : ");
//        int n = in.nextInt();
//        String s = Integer.toString(n);
//        int Length = s.length();
//        int ans = 0;
//        int i = 1;
//        int j = 1;
//        int result=0;
//        while (i <= Length) {
//            int rem = n % 10;
//            if (rem > 0) {
//                int re=1;
//                while (j <= Length) {
//                    ans = re * rem;
//                    re+=ans;
//                    j++;
//                }
//                result+=re;
//            }
//            n = n / 10;
//            i++;
//        }
//        System.out.println(result);
//    }
//}
//...................wrong



public class Program65_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number : ");
        long n = in.nextInt();
        long temp=n;
        String s = Long.toString(n);
        int Length = s.length();
        long ans = 0;
        int i = 0;
        while (i < Length) {
            long rem = n % 10;
            ans += Math.pow(rem, Length);
            n=n/10;
            i++;
        }
        System.out.println(ans);
        if(ans==temp){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
