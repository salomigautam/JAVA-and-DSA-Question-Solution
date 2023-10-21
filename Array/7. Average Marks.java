package com.shalom;

public class Program126_AverageMarks {
    public static void main(String[] args) {
        int[] marks={10,20,20,30,20};
        int sum=0;
        int avg;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }

        avg=sum/marks.length;
        System.out.println(avg);
    }
}
