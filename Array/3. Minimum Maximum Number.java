package com.shalom;

public class  Program121_MInMaxNumber {
    public static void main(String[] args) {
        int[] numbers={5,6,20,54,2,6,99};

        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
