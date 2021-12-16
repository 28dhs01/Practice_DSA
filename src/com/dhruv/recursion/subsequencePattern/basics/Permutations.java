package com.dhruv.recursion.subsequencePattern.basics;

import java.util.ArrayList;
import java.util.Collections;

public class Permutations {
    public static void main(String[] args) {

        ArrayList<String> ans = permutations("","abc",new ArrayList<String>());
        System.out.println(ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
    static ArrayList<String> permutations(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        // body and calls
        char ch = up.charAt(0);
        for( int i = 0 ; i<= p.length() ;i++){
            String f = p.substring(0,i);
            String s = p.substring(i);;
            permutations(f+ch+s,up.substring(1),list);
        }
        return list ;
    }
}
