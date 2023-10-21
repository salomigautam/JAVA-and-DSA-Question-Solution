package com.shalom;
import java.util.Scanner;
public class Program104_Cirle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float radius=in.nextInt();

        float ans1=circumference(radius);
        System.out.println(ans1);

        float ans2=AreaOfCircle(radius);
        System.out.println(ans2);
    }
    static float circumference(float radius){
        return (float) (2*3.14*radius);
    }

    static float AreaOfCircle(float radius){
        return (float) (2*3.14*radius*radius);
    }
}
