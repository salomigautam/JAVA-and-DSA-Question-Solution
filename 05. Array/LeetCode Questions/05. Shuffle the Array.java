package com.shalom;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        int[] ans = new int[nums.length];
        int x = 0;
        for(int i = 0; i < n; i++){
            ans[x] = nums[i];
            ans[x + 1] = nums[n + i];
            x += 2;
        }
        System.out.println(Arrays.toString(ans));
    }
}
