package com.ArraysLeetcode;
public class Number_of_Good_Pairs {
    public static void main(String[] args){
        int[] nums = {1,2,3,1,1,3};
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i < j){
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
