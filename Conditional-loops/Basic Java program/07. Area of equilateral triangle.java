package com.shalom;
import java.util.Scanner;
public class Program20_AreaOfEquilateralTriangle {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter value of side of equilateral triangle : ");
        float side=in.nextFloat();
        double Area_Of_EquilateralTriangle=(1.73*side*side)/4;
        System.out.println("Area of equilateral triangle = "+Area_Of_EquilateralTriangle);
    }
}
