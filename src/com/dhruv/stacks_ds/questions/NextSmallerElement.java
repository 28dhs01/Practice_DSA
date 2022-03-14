package com.dhruv.stacks_ds.questions;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int [] ar = {8,4,6,2,3};
        System.out.println(Arrays.toString(ar));
//        int[] ans = nextSmaller(ar);
//        System.out.println(Arrays.toString(ans));
        int[] ansUsingStack = nextSmallerUsingStack(ar);
        System.out.println(Arrays.toString(ansUsingStack));
    }
    static int[] nextSmaller(int []arr){
        int [] ans = new int[arr.length] ;
        int k =0 ;
        for( int i = 0 ; i<arr.length  ; i++ ){
            boolean smallerFound = false ;
            for(int j = i+1 ;j<arr.length ;j ++ ){
                if( arr[i] > arr[j] ){
                    smallerFound = true ;
                    ans[k] = arr[j] ;
                    k++ ;
                    break;
                }
            }
            if( !smallerFound ){
                ans[k] = -1 ;
                k++ ;
            }
        }
        return ans ;
    }
    static int[] nextSmallerUsingStack(int[] arr){
        int [] ans= new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for( int i = ans.length-1 ; i>=0 ; i-- ){
            while ( arr[i] < stack.peek() ){
                stack.pop() ;
            }
            ans[i] = stack.peek() ;
            stack.push(arr[i]);
        }
        return ans ;
    }
}
