package com.dhruv.recursion.subsequencePattern.basics;

public class SkipString {
    public static void main(String[] args) {
        // First task is to skip apple from given string
        // Second task is to skip app not apple

        String str = "pdapplenkdappks";
        String ans  = skipApple("",str);
        System.out.println(ans);
        String ans2 = skipAppNotApple("",str);
        System.out.println(ans2);

    }
    static String skipApple(String p, String up){
        // base case
        if( up.isEmpty() ){
            return p ;
        }
        // body and calls
        char ch = up.charAt(0) ;
        if( up.startsWith("apple")){
            return skipApple(p,up.substring(5));
        }
        else{
            return skipApple(p+ch,up.substring(1));
        }
    }
    static String skipAppNotApple(String p, String up){
        // base case
        if( up.isEmpty() ){
            return p ;
        }
        // body and calls
        char ch = up.charAt(0);
        if( up.startsWith("app") && !up.startsWith("apple") ){
            return skipAppNotApple(p,up.substring(3));
        }
        else{
            return skipAppNotApple(p+ch,up.substring(1));
        }
    }


}
