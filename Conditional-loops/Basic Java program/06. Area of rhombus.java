package com.shalom;
import java.util.Scanner;
public class Program19_AreaOfRhombus {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of diagonal 1 : ");
        float d1=in.nextFloat();
        System.out.print("enter a value of diagonal 2 : ");
        float d2=in.nextFloat();
//        float Area_Of_Rhombus=(1*d1*d2)/2;
        float Area_Of_Rhombus=(float)1/2*d1*d2;

        System.out.println("Area of Rhombus = "+Area_Of_Rhombus);
    }
}
