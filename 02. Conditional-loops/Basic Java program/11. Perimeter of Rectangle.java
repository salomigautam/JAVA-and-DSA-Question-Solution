package com.shalom;
import java.util.Scanner;
public class Program24_PerimeterOfRectangle {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a length of rectangle : ");
        float length=in.nextFloat();
        System.out.println("enter a width of rectangle : ");
        float width=in.nextFloat();
        float PerimeterOfRectangle=2*(length+width);
        System.out.println("Perimeter of Rectangle = "+PerimeterOfRectangle);
    }
}
