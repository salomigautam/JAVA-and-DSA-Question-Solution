package com.shalom;

public class Program74_AugustMonthEvenDaysCount {
    public static void main(String[]args){
        System.out.println("kunal allowed to go out only in even days. we have to count the even days where the kunal " +
                "can go out in month of august ");
        int totdays=31;
        int days=0;
        int res=0;
        int i=1;
        while(i<=totdays){
            res=i%2;
            if(res==0){
                days+=1;
            }
            i++;
        }
        System.out.println("kunal allowed to go out "+days+" days in august month");

    }
}
