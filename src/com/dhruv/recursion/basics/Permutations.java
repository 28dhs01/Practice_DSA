package com.dhruv.recursion.basics;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        int n = 3 ;
        StringBuilder builder = new StringBuilder();
        for(int i =1 ;i <=n ; i++){
            builder.append(i);
        }
        ArrayList<String> ans = permutations("",builder.toString(),new ArrayList<>());
        System.out.println(ans);
        int k = 6 ;
        System.out.println(ans.get(k-1));
    }
    static ArrayList<String> permutations(String p, String up,ArrayList<String>list){
        if( up.isEmpty() ){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for( int i = 0 ; i<= p.length(); i++ ){
            String f = p.substring(i,p.length());
            String s = p.substring(0,i);
            permutations(f+ch+s,up.substring(1),list);
        }
        return list;
    }
}
