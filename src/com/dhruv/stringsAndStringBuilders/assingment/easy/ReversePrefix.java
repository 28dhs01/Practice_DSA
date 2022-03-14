package com.dhruv.stringsAndStringBuilders.assingment.easy;

import java.util.ArrayList;
//https://leetcode.com/problems/reverse-prefix-of-word/submissions/
public class ReversePrefix {
    public static void main(String[] args) {

//        the below code inside main() is the background of the solution. It has directly no relation with solution
//        String name = "dhruv" ;
//        ArrayList<Character> list = new ArrayList<>() ;
//        for( int i = 3 ;i>=0 ;i-- ){
//             list.add(name.charAt(i));
//        }
//        System.out.println(list);
//        String ans = "";
//        for (int i = 0 ;i < list.size() ; i++ ){
//            ans = ans+list.get(i) ;
//        }
//        System.out.println(ans);

    }
     String reversePrefix(String word, char ch) {
        int firstIdxOfChar = -1 ;
        for( int i = 0 ; i<word.length() ;i++ ){
            if( word.charAt(i) == ch ){
                firstIdxOfChar = i ;
                break ;
            }
        }
        if( firstIdxOfChar == -1 ){
            return word ;
        }
        String ans = "" ;
        for( int i = firstIdxOfChar; i>=0 ; i-- ){
            ans = ans+word.charAt(i);
        }
        for( int i = firstIdxOfChar+1 ; i<word.length() ;i++){
            ans = ans+word.charAt(i) ;
        }
        return ans ;
    }
}
