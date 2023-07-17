package com.shalom;
import java.util.Scanner;
public class Program14_AreaOfCircle {
    public static void main(String[]args){
    Scanner in =new Scanner(System.in);
    double pi=3.14;
    System.out.println("enter radius of circle : ");
    float r=in.nextFloat();
    double Area_Of_Circle=pi*r*r;
    System.out.println("Area of Circle =" +Area_Of_Circle);
    }
}
