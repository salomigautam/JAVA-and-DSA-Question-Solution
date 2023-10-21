package com.shalom;
import java.util.Scanner;
public class Program17_AreaOfIsoscelesTriangle {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter base of triangle : ");
        float base=in.nextFloat();
        System.out.println("Enter height of triangle : ");
        float height=in.nextFloat();
        float Area_Of_Triangle=(float) 1/2*base*height;
        System.out.println("Area of Triangle = "+Area_Of_Triangle);
    }
}
