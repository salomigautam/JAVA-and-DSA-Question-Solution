package com.shalom;
//public class Program_DistBetTwoPoints {
//    public static void main(String[]args){
//        int x1=1;
//        int y1=4;
//        int x2=3;
//        int y2=6;
//        double Dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
//        System.out.println("distance between "+"("+x1+","+y1+")"+","+"("+x2+","+y2+")"+"===>"+Dist);
//    }
//}


import java.util.Scanner;
public class Program56_DistBetTwoPoints {
    public static void main(String[]args){
        Scanner in=new Scanner (System.in);
        System.out.print("enter the x1 point : ");
        int x1=in.nextInt();
        System.out.print("enter the y1 point : ");
        int y1=in.nextInt();
        System.out.print("enter the x2 point : ");
        int x2=in.nextInt();
        System.out.print("enter the y2 point : ");
        int y2=in.nextInt();
        double Dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between "+"("+x1+","+y1+")"+","+"("+x2+","+y2+")"+"===>"+Dist);
    }
}



