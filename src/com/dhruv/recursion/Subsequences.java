package com.dhruv.recursion;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        int k = 3;
        ArrayList<String>ans = subsequences("","123",new ArrayList<>());
        System.out.println(ans);
        System.out.println(ans.get(k-1));
    }
    static ArrayList<String> subsequences(String p , String up, ArrayList<String> list){
        if( up.isEmpty() ){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0) ;
        ArrayList<String> left = subsequences(p+ch,up.substring(1),list);
        ArrayList<String> right = subsequences(p,up.substring(1),list);
        return list;
    }
}
