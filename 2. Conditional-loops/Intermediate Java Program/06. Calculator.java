package com.shalom;
import java.util.Scanner;
public class Program51_Calculator {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.println("enter the operator : ");
            char op=in.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
                System.out.println("enter the first number : ");
                int num1 = in.nextInt();
                System.out.println("enter the second number : ");
                int num2 = in.nextInt();
                if (op== '+') {
                    ans = num1 + num2;
                }
                if (op== '-') {
                    ans = num1 - num2;
                }
                if (op== '*') {
                    ans = num1 * num2;
                }
                if (op== '/') {
                    if(num2!=0) {
                        ans = num1 / num2;
                    }
                }
                if (op== '%') {
                    ans = num1 % num2;
                }
                System.out.println(ans);
            }
            else if(op=='X' || op=='x'){
                break;
            }
            else{
                System.out.println("invalid operation!!!!! enter the valid operator");
            }
//            System.out.println(ans);
        }

    }
}
