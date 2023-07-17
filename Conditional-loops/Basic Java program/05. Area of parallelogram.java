package com.shalom;
import java.util.Scanner;
public class Program18_AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter base of parallelogram : ");
        float base = in.nextFloat();
        System.out.println("enter height of paralleloogram : ");
        float height = in.nextFloat();
        float Area_Of_Parallelogram = base * height;
        System.out.println("Area of parallelogram = " + Area_Of_Parallelogram);
    }
}

