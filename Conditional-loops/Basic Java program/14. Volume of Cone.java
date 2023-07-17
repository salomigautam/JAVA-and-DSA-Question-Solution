package com.shalom;
import java.util.Scanner;
public class Program27_VolumeOfCone {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        double pi=3.14;
        System.out.println("enter base radius of cone : ");
        float r=in.nextFloat();
        System.out.println("enter height of cone : ");
        float h=in.nextFloat();
        double VolumeOfCone=(1*pi*r*r*h)/3;
        System.out.println("Volume of Cone = "+VolumeOfCone);
    }
}
