package com.shalom;

public class Program124_SUM {
    public static void main(String[] args) {
//        int[] numbers={20,30,50};

//        int sum=0;
//        for(int i=0;i<numbers.length;i++){
//            sum+=numbers[i];
//        }
//        System.out.println(sum);
//    }
//}
        int[] numbers = {20, 30, 50};

        int ans=sum(numbers);
        System.out.println(ans);
    }

    static int sum(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }
}