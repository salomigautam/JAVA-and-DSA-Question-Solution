package com.RecursionAssignment;

import java.util.Arrays;

public class Question19_BalancedParenthesis {
    public static void main(String[] args) {
        char[] s = "[(())[{{}]})".toCharArray();

        if(Balanced(s, s.length)){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
    static boolean Balanced(char[] s, int n){
        if(n == 0){
            return true;
        }
        if(n == 1){
            return false;
        }
        if(s[0] == ')' || s[0] == ']' || s[0] == '}'){
            return false;
        }
        char closing = findClosing(s[0]);

        int count = 0;
        int i;
        for(i = 1; i < n; i++){
            if (s[i] == s[0]){
                count++;
            }
            if(s[i] == closing){
                if(count == 0){
                    break;
                }
                count--;
            }
        }

        if(i == n){
            return false;
        }
        if(i == 1){
            return Balanced(Arrays.copyOfRange(s, i + 1, n), n - 2);
        }
        return Balanced(Arrays.copyOfRange(s, 1, i), i - 1) && Balanced(Arrays.copyOfRange(s, i + 1, n), n - i - 1);
    }

    static char findClosing(char c){
        if(c == '('){
            return ')';
        }
        if(c == '['){
            return ']';
        }
        if (c == '{') {
            return '}';
        }
        return Character.MIN_VALUE;
    }
}
