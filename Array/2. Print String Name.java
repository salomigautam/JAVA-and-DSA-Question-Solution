package com.shalom;
import java.util.Arrays;
import java.util.Scanner;
public class Program120_PrintStringName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int size=in.nextInt();
            String[] names=new String[size];

            for(int i=0;i<size;i++){
                names[i]=in.next();
            }

            for(int i=0; i<names.length;i++){
                System.out.println(names[i]);
        }
        System.out.println(Arrays.toString(names));
    }
}
