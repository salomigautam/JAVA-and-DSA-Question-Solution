package com.shalom;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<Boolean>();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        int max = 0;
        for(int i = 0;i<candies.length;i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }
        for(int i =0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        System.out.println(list);
    }
}
