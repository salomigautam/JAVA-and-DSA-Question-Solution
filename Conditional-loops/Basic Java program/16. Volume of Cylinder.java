package com.shalom;
import java.util.Scanner;
public class Program29_VolumeOfCylinder {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        double pi=3.14;
        System.out.println("enter radius of cylinder : ");
        float r=in.nextFloat();
        System.out.println("enter height of cylinder : ");
        float h=in.nextFloat();
        double VolumeOfCylinder=pi*r*r*h;
        System.out.println("Volune of cylinder = "+VolumeOfCylinder);
    }
}
