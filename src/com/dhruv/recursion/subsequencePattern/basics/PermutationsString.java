package com.dhruv.recursion.subsequencePattern.basics;

import java.util.ArrayList;

public class PermutationsString {
    public static void main(String[] args) {

//        ArrayList<String> ans = permutations("","abc",new ArrayList<String>());
//        System.out.println(ans);
//        Collections.sort(ans);
//        System.out.println(ans);


        ArrayList<String> ans = new ArrayList<>();
        permutation("","abc",ans);
        System.out.println(ans);
        int ansCount  = permutationCount("","abc");
        System.out.println(ansCount);


    }
//    static ArrayList<String> permutations(String p, String up, ArrayList<String> list){
//        if(up.isEmpty()){
//            list.add(p);
//            return list;
//        }
//        // body and calls
//        char ch = up.charAt(0);
//        for( int i = 0 ; i<= p.length() ;i++){
//            String f = p.substring(0,i);
//            String s = p.substring(i);;
//            permutations(f+ch+s,up.substring(1),list);
//        }
//        return list ;
//    }

    static void permutation(String p, String up, ArrayList<String> list) {
//        base case
        if( up.isEmpty() ){
            list.add(p);
            return;
        }
//        body
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1 ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutation(f+ch+s,up.substring(1),list);
        }
    }
    static int permutationCount(String p, String up ) {
//        base case
        if( up.isEmpty() ){
            return 1 ;
        }
//        body
        int count = 0 ;
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1 ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            count += permutationCount(f+ch+s,up.substring(1));
        }
        return count ;
    }
}
