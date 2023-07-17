package com.shalom;
import java.util.Scanner;
public class Program22_PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of its sides = ");
        float sides=in.nextFloat();
        float Perimeter_of_equilateral_Triangle=3*sides;
        System.out.println("Perimeter of equilateral Triangle : "+Perimeter_of_equilateral_Triangle);
    }
}
