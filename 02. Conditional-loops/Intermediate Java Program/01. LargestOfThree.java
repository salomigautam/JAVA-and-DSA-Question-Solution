package com.shalom;
import java.util.Scanner;

//            APPROACH 1
//public class Program46_LargestOfThree {
//    public static void main(String[]args){
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter first number : ");
//        int a=in.nextInt();
//        System.out.println("enter second number : ");
//        int b=in.nextInt();
//        System.out.println("enter third number : ");
//        int c=in.nextInt();
//
//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//
//        }
//        System.out.println();
//        System.out.println(max);
//    }
//}


//                APPROACH 2
//public class Program46_LargestOfThree {
//    public static void main(String[]args){
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter first number : ");
//        int a=in.nextInt();
//        System.out.println("enter second number : ");
//        int b=in.nextInt();
//        System.out.println("enter third number : ");
//        int c=in.nextInt();
//
//        int max=0;
//        if(a>b){
//            max=a;
//        }
//        else{
//            max=b;
//        }
//        if(c>max){
//            max=c;
//
//        }
//        System.out.println();
//        System.out.println(max);
//    }
//}

//            APPROACH 3
public class Program46_LargestOfThree {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=in.nextInt();
        System.out.println("enter second number : ");
        int b=in.nextInt();
        System.out.println("enter third number : ");
        int c=in.nextInt();

       int max=Math.max(c,Math.max(a,b));
        System.out.println();
        System.out.println(max);
    }
}
