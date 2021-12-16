package com.dhruv.sortingAlgos;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {5,2,6,4,7,3,2,1};
//        mergeSortInPlace(arr, 0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        int []sortedArray = mergeSort(arr) ;
        System.out.println(Arrays.toString(sortedArray));


    }
    static void  mergeSortInPlace(int []arr, int s, int e){
        // base case
        if( s==e ){
            return ;
        }
        int m = s + ( e - s ) / 2 ;
        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m+1, e);
        merge(arr, s,m,e);
    }
    static void merge( int[]arr, int s, int m , int e){
        int[]dummy = new int[e-s+1];
        int i = s ;
        int j = m+1;
        int k = 0;
        while( i<=m && j<=e ){
            if( arr[i] < arr[j]){
                dummy[k] = arr[i];
                k++;
                i++;
            }
            else{
                dummy[k] = arr[j];
                k++ ;
                j++ ;
            }
        }
        while (i<=m){
            dummy[k] = arr[i];
            k++;
            i++;
        }
        while (j<=e){
            dummy[k] = arr[j];
            k++ ;
            j++ ;
        }
        for (int l = 0; l < dummy.length ; l++) {
            arr[l+s] = dummy[l];
        }
    }
    static int[] mergeSort(int []arr){
        // base case
        if( arr.length == 1 ){
            return arr ;
        }
        // body and calls
        int m = arr.length/2 ;
        int []left = mergeSort(Arrays.copyOfRange(arr,0,m));
        int []right = mergeSort(Arrays.copyOfRange(arr,m,arr.length));
        return mix(left, right);
    }
    static int[] mix(int[]left, int []right){
        int[]mix = new int [left.length+right.length];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while ( i< left.length && j< right.length ){
            if( left[ i ] < right[ j ] ){
                mix[ k ] = left[ i ];
                i++ ;
            }
            else{
                mix[ k ] = right [ j ] ;
                j++ ;
            }
            k++ ;
        }
        while ( i < left.length ){
            mix[ k ] = left[ i ];
            i++ ;
            k++ ;
        }
        while( j < right.length){
            mix[ k ] = right[ j ] ;
            j++ ;
            k++ ;
        }
        return mix ;
    }
}
