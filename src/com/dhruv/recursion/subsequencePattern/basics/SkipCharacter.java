package com.dhruv.recursion.subsequencePattern.basics;

public class SkipCharacter {
    public static void main(String[] args) {
        // skip 'a' from given string
        String str = "acdabad";
//        String ans = skip("",str);
        String ans = skip2(str);
        System.out.println(ans);
    }
    public static String skip(String p, String up){
        // base case
        if( up.isEmpty() ){
            return p;
        }
        // body and calls
        char ch = up.charAt(0 );
        if( ch == 'a' ){
            return skip(p,up.substring(1));
        }
        else{
            return skip(p+ch,up.substring(1));
        }
    }
    public static String skip2(String up){
        if( up.isEmpty() ){
            return "";
        }
        // body and calls
        char ch = up.charAt(0 );
        if( ch == 'a' ){
            return skip2(up.substring(1));
        }else{
            return ch+skip2(up.substring(1));
        }
    }
}
