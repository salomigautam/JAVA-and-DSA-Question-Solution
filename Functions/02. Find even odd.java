package com.shalom;
public class Program100_EvenOddMethod {
    public static void main(String[] args) {
        int n1=18;

        String ans=EvenOdd(n1);
        System.out.println(ans);
    }
    static String EvenOdd(int n1){
        if(n1%2==0){
            return "even number";
        }
        else{
            return "odd number";
        }
    }
}
