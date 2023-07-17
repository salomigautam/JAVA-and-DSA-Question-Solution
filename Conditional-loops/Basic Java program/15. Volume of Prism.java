package com.shalom;
import java.util.Scanner;
public class Program28_VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of base area B ; ");
        float B=in.nextFloat();
        System.out.println("enter the height of Prism : ");
        float H=in.nextFloat();
        float VolumeOfPrism=B*H;
        System.out.println("Volume of Prism = "+VolumeOfPrism);
    }
}
