package com.shalom;

public class Program128_MaxElement {
    public static void main(String[] args) {
        int[] numbers={20, 60, 50, 10, 2, 420, 63, 9};
        int max=numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println(max);
    }
}
