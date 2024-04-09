package com.RecursionAssignment;

public class Question4_First_Uppercase_Letter_in_a_String {
    public static void main(String[] args) {
        String s = "gEeksforgeeKs";
//        char res = firstCapitalLetter(s);
//        if(res == 0){
//            System.out.println(" No capital letter found");
//        }
//        else{
//            System.out.println(res);
//        }

//        allCapitalLetter(s);

//        CapLettUsingRec(s , 0);
//        char ans = firstCapLettUsingRec(s, 0);
//        System.out.println(ans);

//        allCapLettUsingRecReturn(s, 0, false);
        allCapLettUsingRecReturn(s, 0, 0);
    }

    // Linear Search method
//    static char firstCapitalLetter(String s){
//        for(int  i = 0; i < s.length(); i++){
//            if(Character.isUpperCase(s.charAt(i))){
//                return s.charAt(i);
//            }
//        }
//        return 0;
//    }

//    static void allCapitalLetter(String s) {
//        for(int i = 0; i < s.length(); i++){
//            if(Character.isUpperCase(s.charAt(i))){
//                System.out.print(s.charAt(i) + " ");
//            }
//        }
//
//    }

    // Using Recursion

//    static void CapLettUsingRec(String s , int i){
//        if(i == s.length()){
//            return;
//        }
//        if(Character.isUpperCase(s.charAt(i))){
//            System.out.println(s.charAt(i));
//        }
//        CapLettUsingRec(s, i + 1);
//    }

//    static char firstCapLettUsingRec(String s, int i){
//        if (i == s.length()){
//            return 0;
//        }
//        if(Character.isUpperCase(s.charAt(i))){
//            return s.charAt(i);
//        }
//        return firstCapLettUsingRec(s, i + 1);
//    }

//    static char allCapLettUsingRecReturn(String s , int i, Boolean j){
//        if(i == s.length()){
//            if(j == false){
//                System.out.println("Not found");
//            }
////            System.out.println("Toatal capital count  = "+ j);
//            return 0;
//        }
//        if(Character.isUpperCase(s.charAt(i))){
//            j = true;
//            System.out.println(s.charAt(i));
//
//        }
//        return allCapLettUsingRecReturn(s, i + 1 , j);
//    }

    static char allCapLettUsingRecReturn(String s , int i, int j){
        if(i == s.length()){
            if(j == 0){
                System.out.println("Not found");
            }
            System.out.println("Toatal capital count  = "+ j);
            return 0;
        }
        if(Character.isUpperCase(s.charAt(i))){
            j += 1;
            System.out.println(s.charAt(i));

        }
        return allCapLettUsingRecReturn(s, i + 1 , j);


    }
}
