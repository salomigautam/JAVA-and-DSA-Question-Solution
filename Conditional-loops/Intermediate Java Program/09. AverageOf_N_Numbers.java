//package com.shalom;
//import java.util.Scanner;
//public class Program54_AverageOf_N_Numbers {
//    public static void main(String[]args){
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter the value of N : ");
//        int N=in.nextInt();
//        float average=0;
//        int temp=N;
//        while(N>0){
//            average +=N;
//            N--;
//        }
//        System.out.println(average/temp);
//    }
//}


package com.shalom;
import java.util.Scanner;
public class Program54_AverageOf_N_Numbers {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of N : ");
        int N=in.nextInt();
        float average=0;
        int i=1;
        while(i<=N){
            average +=i;
            i++;
        }
        System.out.println(average/N);
    }
}

//both programs right here
//but in second block of code when we print the average there if we divide the average by i why not giving same answer
// as average divide by N
//average divide by N giving right answer
//if we take N=10 then N in print statement will be 10 also in block of code we are incrementing the value of i and lastly
// the value of i will be 10 then why after dividing by i not giving same answer as divide by N
//divide by i giving -0.5 of answer as compare to divide by N answer

//solution==here in second block of code lastly i==11...that's why its giving 5.0 answer
//both block of code are right.