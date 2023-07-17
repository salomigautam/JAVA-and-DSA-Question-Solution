package com.shalom;
import java.util.Scanner;
public class Program33_TotalSurfaceAreaOfCube {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of sides of cube : ");
        float side=in.nextFloat();
        float TSAOC=6*side*side;
        System.out.println("Toatal surface area od cube = "+TSAOC);


    }
}
