package com.shalom;
import java.util.Scanner;
public class Program26_PerimeterOfRhombus {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a length of sides of rhombus : ");
        float a=in.nextFloat();
        float Perimeter_Of_Rhombus=4*a;
        System.out.println("Perimeter of Square= "+Perimeter_Of_Rhombus);
    }
}
