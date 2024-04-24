package com.RecursionAssignment;

public class Question18_SortedOrNot {
    public static void main(String[] args) {
        int[] num = {20, 21, 45, 89, 89, 90};
        System.out.println(sortedOrNot(num, 0));
    }
    static boolean sortedOrNot(int[] num, int i){
        if(i == num.length - 1){
            return true;
        }
        if(num[i] > num[i + 1]){
            return false;
        }
        return sortedOrNot(num, i + 1);
    }
}
