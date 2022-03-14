package com.dhruv.arrays.easy;

import java.util.ArrayList;

public class MinOrMax {
    public static void main(String[] args) {
        long[] ar = {3,2,1,56,1000,67};
        long n = ar.length ;
        getMinMax(ar,n);
    }
    static ArrayList<Long> getMinMax(long a[], long n) {

        long min = Long.MAX_VALUE ;
        long max = Long.MIN_VALUE ;
        for( int i = 0 ; i<n ;i++ ){
           min = Math.min(a[i],min);
           max = Math.max(a[i],max);
        }
        ArrayList<Long> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        return list ;


    }
}
