package com.dhruv.stringsAndStringBuilders.assingment.medium;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        int ans = repeatedStringMatch("abcd","cdabcdab");
        System.out.println(ans);



    }
    static int repeatedStringMatch(String a, String b) {
        int count = 1 ;
        StringBuilder sb = new StringBuilder(a);
        while( b.length() < sb.length() ){
            sb.append(a);
            count++ ;
        }
        if( sb.indexOf(b) != -1 ){
            return count ;
        }
        sb.append(a);
        count++ ;
        if(sb.indexOf(b) == -1 ){
            return -1 ;
        }else{
            return count ;
        }
    }
}
