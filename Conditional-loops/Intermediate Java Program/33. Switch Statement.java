package com.shalom;
import java.util.Scanner;
public class Program78_SwitchStmt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit;
        fruit=in.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "orange":
                System.out.println("orange fruit");
                break;
            case "apple":
                System.out.println("healthy fruit");
                break;
            default:
                System.out.println("enter the valid fruit");
                break;
        }
    }
}
