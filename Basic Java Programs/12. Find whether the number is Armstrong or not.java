package com.shalom;

public class Program13_ArmstrongNumber {
    public static void main(String[] args) {
        int num1 = 153;
        int num2 = 371;
        int temp1=num1;
        int temp2=num2;
        String s1 = Integer.toString(num1);
        String s2 = Integer.toString(num2);
        System.out.println("First number is : " + num1);
        System.out.println("Second number is : " + num2);
        int Length_s1 = s1.length();
        int Length_s2 = s2.length();
        int ans1=0;
        int ans2=0;
        while(num1>0){
            int rem=num1%10;
            ans1+=Math.pow(rem,Length_s1);
            num1/=10;
        }
        System.out.println(ans1);

        while(num2>0){
            int rem=num2%10;
            ans2+=Math.pow(rem,Length_s2);
            num2/=10;
        }
        System.out.println(ans2);

        if(ans1==temp1 && ans2==temp2) {
            System.out.println("both are armstrong number");
        }
        else if(ans1==temp1){
            System.out.println("armstrong number is : "+temp1);
        }
        else if(ans2==temp2){
            System.out.println("armstrong number is : "+temp2);
        }
        else{
            System.out.println("both are not armstrong number");
        }

    }
}
