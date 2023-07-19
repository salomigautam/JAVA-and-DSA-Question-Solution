package com.shalom;
import java.util.Scanner;
//public class Program61_CGPA {
//    public static void main(String[]args){
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter the percentage ; ");
//        double per=in.nextFloat();
//        double CGPA=per/9.5;
//        System.out.println("CGPA ="+CGPA);
//    }
//}
//


public class Program61_CGPA {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=5;
        int i=0;
        double[] marks=new double[n];
        System.out.println("enter the top five subject marks : ");
        while(i<n) {
            marks[i] = in.nextInt();
            i++;
        }

        double[]grade=new double[n];
        i=0;
        while(i<n){
            grade[i]=marks[i]/10;
            i++;
        }

        double sum=0;
        i=0;
        while(i<n){
            sum+=grade[i];
            i++;
        }

        double CGPA=sum/5;
        System.out.println("CGPA ="+CGPA);
    }
}
