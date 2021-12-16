package com.dhruv.recursion.subsequencePattern.basics;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
//        int[] arr = {1,2,3 };
//        List<List<Integer>> ans = subset(arr);
//        ans.remove(0);
//        System.out.println(ans);

        int []arr = {1,1,2,2};
        List<List<Integer>> ans = subsetDuplicates(arr);
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr) {
            int n = outer.size() ;
            for( int i = 0 ;i<n ;i++ ){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        }

        return outer ;
    }
    static List<List<Integer>> subsetDuplicates(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0 ;
        int end = 0 ;
        for (int i = 0 ; i<arr.length ; i++ ) {
            start = 0 ;
            if( i>0 && arr[i] == arr[i-1]){
                start = end+1 ;
            }
            end = outer.size()-1 ;
            int n = outer.size() ;
            for( int j = start ;j<n ;j++ ){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }

        }

        return outer ;
    }

}
