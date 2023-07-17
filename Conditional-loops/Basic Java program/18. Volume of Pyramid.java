package com.shalom;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Program31_VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter area of base of the pyramid : ");
        float B=in.nextFloat();
        System.out.println("enter height of the pyramid : ");
        float H=in.nextFloat();
        float VOP=(float)1/3*B*H;
        System.out.println("Volume Of Pyramid = "+VOP);
    }
}
