package com.dhruv.recursion.subsequencePattern.basics;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {

        //ArrayList<String> ans = subSeq("" ,"abc",new ArrayList<>());
//        ArrayList<String> ans = subSeq2("" ,"abc");
//        ArrayList<String> ans = subSeqAscii("" ,"abc",new ArrayList<>());
//        System.out.println(ans);

        ArrayList<String> res = subAscii("","ab");
        System.out.println(res);


        

    }
    static ArrayList<String> subSeq(String p, String up, ArrayList<String> list){
        if( up.isEmpty() ){
            if( !p.isEmpty() ){
                list.add( p ) ;
            }
            return list ;
        }
        // body and calls
        char ch = up.charAt(0) ;
        subSeq(p+ch,up.substring(1),list);
        subSeq(p,up.substring(1),list);
        return list ;
    }
    static ArrayList<String> subSeq2(String p, String up){
        if( up.isEmpty() ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        // body and calls
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq2(p+ch,up.substring(1));
        ArrayList<String> right = subSeq2(p,up.substring(1));
        left.addAll(right);
        return left ;
    }
    static ArrayList<String> subSeqAscii(String p, String up, ArrayList<String> list){
        if( up.isEmpty() ){

            list.add( p ) ;

            return list ;
        }
        // body and calls
        char ch = up.charAt(0) ;
        int val = (int)(ch) ;
        subSeqAscii(p+ch,up.substring(1),list);
        subSeqAscii(p+val,up.substring(1),list);
        subSeqAscii(p,up.substring(1),list);
        return list ;
    }
    static ArrayList<String> subAscii(String p, String up){
//        base case
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
//        body
        char ch = up.charAt(0);
        int ascii = ch+ 0 ;
        ArrayList<String> f = subAscii(p+ch,up.substring(1));
        ArrayList<String> s = subAscii(p+ascii,up.substring(1));
        ArrayList<String> t = subAscii(p,up.substring(1));
        f.addAll(s);
        f.addAll(t);
        return f ;


    }

}
