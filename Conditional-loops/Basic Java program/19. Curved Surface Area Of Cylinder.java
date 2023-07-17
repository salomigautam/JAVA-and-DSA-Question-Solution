package com.shalom;
import java.util.Scanner;
public class Program32_CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double pi=3.14;
        System.out.println("enter radius of the cylinder : ");
        float r=in.nextFloat();
        System.out.println("enter height of the cylinder : ");
        float h=in.nextFloat();
        double CSAOC=2*pi*r*h;
        System.out.println("Curved surface area of cylinder = "+CSAOC);

    }

}
