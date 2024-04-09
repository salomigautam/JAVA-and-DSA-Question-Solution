package com.shalom;
import java.util.Objects;
import java.util.Scanner;
public class Program6_Greetings {
    public static void main(String []agrs){
        Scanner in=new Scanner(System.in);
        System.out.print("enter a name: ");
        String name=in.next();
        if(Objects.equals(name, "kunal")) {
            System.out.println("thanks kunal for your efforts on DSA java bootcamp");
        }
        if(Objects.equals(name, "salomi")) {
            System.out.println("welcome");
        }
        if(Objects.equals(name, "chelcy")){
            System.out.println("Have a nice day dear");
        }
        if(Objects.equals(name,"vincy")){
            System.out.println("you are very silent girl");
        }
        }


}
