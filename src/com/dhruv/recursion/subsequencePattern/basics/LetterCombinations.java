package com.dhruv.recursion.subsequencePattern.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterCombinations {
    public static void main(String[] args) {
        ArrayList<String> ans = letterCombination("","8",new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<String> letterCombinations(String p, String up,ArrayList<String>list){
        // base case
        if( up.isEmpty() ){
            list.add(p);
            return list ;
        }
        // body and calls
        char ch = up.charAt(0);
        int intVal = ch - '0' ;
        for(int i = 3*(intVal-1); i<3*intVal && i<26 ; i++ ){
            char processed = (char) ('a' + i) ;
            letterCombinations(p+processed, up.substring(1),list);
        }
        return list ;
    }
    static ArrayList<String> letterCombination(String p, String up,ArrayList<String>list){
        // base case
        if( up.isEmpty() ){
            list.add(p);
            return list ;
        }
        // body and calls
        char ch = up.charAt(0);
        int intVal = ch - '0' ;
        if( intVal == 7 || intVal == 9 ){
            for(int i = 3*(intVal-2); i<=3*(intVal-1) && i<26 ; i++ ){
                char processed = (char) ('a' + i) ;
                letterCombination(p+processed, up.substring(1),list);
            }
        }
        else if( intVal == 8 ){
            for( int i = 3*(intVal-2)+1 ; i<= 3*(intVal-1); i++){
                char processed = (char) ('a' + i) ;
                letterCombination(p+processed, up.substring(1),list);
            }
        }
        else{
            for(int i = 3*(intVal-2); i<3*(intVal-1) && i<26 ; i++ ){
                char processed = (char) ('a' + i) ;
                letterCombination(p+processed, up.substring(1),list);
            }

        }
        return list ;
    }
}
