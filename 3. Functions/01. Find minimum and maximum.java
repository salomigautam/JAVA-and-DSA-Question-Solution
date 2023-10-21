package com.shalom;
import java.util.Scanner;
public class Program99_MinMaxMethod {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the three numbers : ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();

        int ans=min(n1,n2,n3);
        System.out.println("min number = "+ans);

        int ans2=max(n1,n2,n3);
        System.out.println("max number = "+ans2);
    }
        static int min(int n1,int n2,int n3){
            if(n1<n2 && n1<n3){
                return n1;
            }
            else if(n2<n1 && n2<n3 ){
                return n2;
            }
            else{
                return n3;
            }


        }

        static int max(int n1,int n2,int n3){
            if(n1>n2 && n1>n3){
                return n1;
            }
            else if(n2>n1 && n2>n3){
                return n2;
            }
            else{
                return n3;
            }
        }
}
