package com.shalom;
import java.util.Scanner;
public class Program122_AssendingOrder  {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size= in.nextInt();
        int[] numbers=new int[size];

        for(int i=0;i<size;i++) {
            numbers[i] = in.nextInt();
        }
        boolean assending=true;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]<numbers[i+1]){
                assending=true;
            }
            else{
                assending=false;
                System.out.println("not assending");
                break;
            }

        }
        if(assending==true) {
            System.out.println("assending");
        }




    }
}
