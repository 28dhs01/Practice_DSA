package com.dhruv.searching;

import java.util.ArrayList;
import java.util.Collections;
//https://www.codingninjas.com/codestudio/problems/aggressive-cows_1082559?leftPanelTab=0
public class AggressiveCows {
    public static void main(String[] args) {
        ArrayList<Integer> stalls = new ArrayList<>();
        stalls.add(0);
        stalls.add(4);
        stalls.add(3);
        stalls.add(7);
        stalls.add(10);
        stalls.add(9);
        int aggressive = 3 ;
        int ans = aggressiveCows(stalls,aggressive);
        System.out.println(ans);
    }

    static int aggressiveCows(ArrayList<Integer> stalls, int k)
    {
        //    Write your code here.
        Collections.sort(stalls) ;
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        for( int i = 0 ; i<stalls.size() ;i ++ ){
            if( stalls.get(i) > max ){
                max = stalls.get(i) ;
            }
            if(stalls.get(i) < min ){
                min = stalls.get(i) ;
            }
        }
        int s = 1 ;
        int e = max-min ;
        int ans = 0 ;
        while( s<=e ){
            int m = s+(e-s)/2 ;
            int cows = 1 ;
            int currentCowPosition = stalls.get(0);
            for( int i = 1 ;i<stalls.size() ;i ++  ){
                if( stalls.get(i)-currentCowPosition >= m ){
                    cows++ ;
                    currentCowPosition = stalls.get(i) ;
                }
            }
            if( cows < k ){
                e = m-1 ;
            }else{
                ans = m ;
                s = m+1 ;
            }
        }
        return ans ;
    }
}
