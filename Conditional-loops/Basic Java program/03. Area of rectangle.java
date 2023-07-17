package com.shalom;
import java.util.Scanner;
public class Program16_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter length of rectangle : ");
        float length=in.nextFloat();
        System.out.println("enter breadth of rectangle : ");
        float breadth=in.nextFloat();
        float Area_Of_Rectangle=length*breadth;
        System.out.println("Area of rectangle = "+Area_Of_Rectangle);
    }
}
