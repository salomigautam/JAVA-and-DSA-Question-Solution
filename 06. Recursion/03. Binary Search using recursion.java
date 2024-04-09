package com.RecursionAssignment;

public class Question3_Binary_Search_using_recursion {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
//        int start = 0;
//        System.out.println(search(nums, target, start));
        System.out.println(searchRecursion(nums, target));
    }

        // Using Binary Search

//    static int search(int[] nums, int target, int start) {
//        if(start == nums.length){
//            return -1;
//        }
//        if(nums[start] == target){
//            return start;
//        }
//        else{
//            return search( nums, target, start + 1);
//        }
//    }



    // Using Recursion
    static int start = 0;
    static int searchRecursion(int[] nums, int target){
        if(start == nums.length){
            return -1;
        }
        if(nums[start] == target){
            return start;
        }
        start++;
        return searchRecursion( nums, target);

    }

}

