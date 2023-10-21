package com.shalom;
import java.util.Scanner;
public class Program9_Operators {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter a first number: ");
        int a=in.nextInt();
        System.out.print("enter a second number: ");
        int b=in.nextInt();
        System.out.print("enter a operator (+,-,*,/,%): ");
        char op=in.next().charAt(0);
        if(op=='+'){
            System.out.print(+a+"+"+b+ "="+(a+b));
        }
        else if(op=='-'){
            System.out.println(+a+"-"+b+"="+(a-b));
        }
        else if(op=='*'){
            System.out.println(+a+"*"+b+"="+(a*b));
        }
        else if(op=='/'){
            System.out.println(+a+"/"+b+"="+(a/b));
        }
        else if(op=='%'){
            System.out.println(+a+"%"+b+"="+(a%b));
        }
        else{
            System.out.println("invalid operator");
        }


    }
}
