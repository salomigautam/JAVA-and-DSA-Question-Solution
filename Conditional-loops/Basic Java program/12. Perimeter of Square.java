package com.shalom;
import java.util.Scanner;
public class Program25_PerimeterOfSquare {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a length of sides of square : ");
        float a=in.nextFloat();
        float Perimeter_Of_Square=4*a;
        System.out.println("Perimeter of Square= "+Perimeter_Of_Square);
    }
}
