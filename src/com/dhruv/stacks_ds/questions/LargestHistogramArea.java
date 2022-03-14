package com.dhruv.stacks_ds.questions;

import java.util.Arrays;
import java.util.Stack;

public class LargestHistogramArea {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int [] nextSmallerIndices = nextSmallerIdx(heights);
        System.out.println(Arrays.toString(nextSmallerIndices));
        int[] prevSmallerIndices = prevSmallerIdx(heights);
        System.out.println(Arrays.toString(prevSmallerIndices));

        int area = 0 ;
        for( int i = 0 ; i<heights.length ; i++ ){
            int l = heights[i] ;
            int b = nextSmallerIndices[i] - prevSmallerIndices[i] - 1 ;
            int newArea = l*b ;
            area = Math.max(area,newArea);
        }
        System.out.println(area);
    }
    static int[] nextSmallerIdx(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        stack.push(heights.length);
        for (int i = heights.length-1; i >=0  ; i--) {

                while( stack.peek() != heights.length && heights[i] <= heights[stack.peek()] ){
                    stack.pop();
                }
                ans[i] = stack.peek();
                stack.push(i);

        }
        return ans;
    }
    static int[] prevSmallerIdx(int[]heights){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        stack.push(-1);
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[i] <= heights[stack.peek()] ){
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans ;
    }
}
 class BruteforceHistogram{
    public static void main(String[] args) {
        int[] heights = {2,1,2};
        int area = 0 ;
        for( int i = 0 ; i < heights.length ; i++ ){
            int j = i+1 ;
            while ( j<heights.length && heights[i] <= heights[j] ){
                j++ ;
            }
            int nextSmallerIdx = j ;
            int k = i-1 ;
            while ( k>=0 && heights[i] <= heights[k] ){
                k--;
            }
            int prevSmallerIdx = k ;
            int l = heights[i];
            int b = nextSmallerIdx-prevSmallerIdx-1 ;
            int newArea = l*b;
            area = Math.max(area,newArea);
        }
        System.out.println(area);

    }
}
