package com.ArraysLeetcode;
import java.util.Arrays;
public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int ans = 0;
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i]){
                    ans += 1;
                }
            }
            result[i] = ans;
        }
        System.out.println(Arrays.toString(result));
    }
}
