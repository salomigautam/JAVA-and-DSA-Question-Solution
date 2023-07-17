package com.shalom;
import java.util.Scanner;
public class Program21_PerimeterOfCircle {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        double pi=3.14;
        System.out.println("enter the radius of circle : ");
        float r=in.nextFloat();
        double Perimeter_Of_Circle=2*pi*r;
        System.out.println("Perimeter of circle = "+Perimeter_Of_Circle);
    }
}
