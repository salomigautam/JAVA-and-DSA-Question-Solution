package com.shalom;
import java.util.Scanner;
public class Program23_PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length of side1 : ");
        float a=in.nextFloat();
        System.out.println("enter the length of side2 : ");
        float b=in.nextFloat();
        float Perimeter_Of_Parallelogram=2*(a+b);
        System.out.println("Perimeter of parallelogram = "+Perimeter_Of_Parallelogram);

    }
}
