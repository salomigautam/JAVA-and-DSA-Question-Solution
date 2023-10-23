package com.shalom;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j >= 0; j--){
            sum += nums[j];
            }
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}

//orrrrrrrrrr


//class Solution {
//    public int[] runningSum(int[] nums) {
//        int[] ans=new int[nums.length];
//        ans[0]=nums[0];
//        for(int i=1;i<nums.length;i++){
//            ans[i]=ans[i-1]+nums[i];
//        }
//        return ans;
//    }
//}