package com.dhruv.stringsAndStringBuilders.assingment.medium;

import java.util.ArrayList;

public class SwapAdjacentLRString {
    public static void main(String[] args) {
        boolean canTransform = canTransform("RXXLRXRXL","XRLXXRRLX");
        System.out.println(canTransform);
    }

    public static boolean canTransform(String start, String end) {

        if( start.length() != end.length() ){
            return false ;
        }

        String s1 = start.replace("X","");
        System.out.println(s1);
        String s2 = end.replace("X","");
        System.out.println(s2);
        if( !s1.equals(s2) ){
            return false;
        }

        ArrayList<Integer> lStart = new ArrayList<>();
        ArrayList<Integer> rStart = new ArrayList<>();
        for( int i = 0 ; i<start.length(); i++ ){
            if( start.charAt(i) == 'R' ){
                rStart.add(i);
            }
            if( start.charAt(i) == 'L' ){
                lStart.add(i);
            }
        }
        ArrayList<Integer> lEnd = new ArrayList<>();
        ArrayList<Integer> rEnd = new ArrayList<>();
        for( int i = 0 ; i<start.length(); i++ ){
            if( end.charAt(i) == 'L' ){
                lEnd.add(i);
            }
            if ( end.charAt(i) == 'R' ){
                rEnd.add(i);
            }
        }

        int p1 = 0 ;
        int p2 = 0 ;
        while( p1 < lStart.size() && p2<lEnd.size() ){
            if( lStart.get(p1) >= lEnd.get(p2) ){
                p1++ ;
                p2++;
            }
            else{
                return false ;
            }
        }
        int p3 = 0 ;
        int p4 = 0 ;
        while( p3 < rStart.size() && p4<rEnd.size()  ){
            if( rStart.get(p3) <= rEnd.get(p4) ){
                p3++ ;
                p4++ ;
            }
            else{
                return false ;
            }
        }
        return true;
    }

}
