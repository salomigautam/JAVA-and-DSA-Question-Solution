package com.shalom;
import java.util.Scanner;
public class Program106_MarkGrade {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the marks out of 100 : ");
        int marks=in.nextInt();

        String result=grade(marks);
        System.out.println(result);

        }
        static String grade(int n){
        if(n>=91 && n<=100){
            return "AA";
        }
        if(n>=81 && n<=90){
            return "AB";
        }
        if(n>=71 && n<=80){
            return "BB";
        }
        if(n>=61 && n<=70){
            return "BC";
        }
        if(n>=51 && n<=60){
            return "CD";
        }
        if(n>=41 && n<=50){
            return "DD";
        }
        if(n<=40){
            return "Fail";
        }
            return null;
        }
}
