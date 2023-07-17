package com.shalom;
import java.util.Scanner;
public class Program30_VolumeOfSphere {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        double pi=3.14;
        System.out.print("enter the radius of sphere : ");
        float r=in.nextFloat();
        double VOS=(float)4/3*pi*r*r*r;
        System.out.println("Volume of Sphere = "+VOS);

    }
}
