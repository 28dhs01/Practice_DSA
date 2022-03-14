package com.dhruv.stacks_ds.questions;

import java.util.Stack;
//https://leetcode.com/problems/maximal-rectangle/submissions/
public class MaximumRectangleInBinaryMatrix {
    public static void main(String[] args) {

        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int ans = maximalRectangle(matrix);
        System.out.println(ans);

    }
    static int maximalRectangle(char[][] matrix) {
        int [][]intMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                intMatrix[i][j] = matrix[i][j]-'0';
            }
        }
        int area = histogramArea(intMatrix[0]);
        for (int i = 1; i < intMatrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if( intMatrix[i][j] != 0 ){
                    intMatrix[i][j] += intMatrix[i-1][j];
                }else{
                    intMatrix[i][j] = 0;
                }
            }
            int newArea = histogramArea(intMatrix[i]);
            area = Math.max(area,newArea);
        }
        return area ;
    }
    static int histogramArea(int[]matrix){
        int[] nextSmallerIndices = nextSmallerIndex(matrix);
        int[] prevSmallerIndices = prevSmallerIndex(matrix);
        int [] w = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            w[i] = nextSmallerIndices[i]-prevSmallerIndices[i]-1 ;
        }
        int area = 0 ;
        for (int i = 0; i < matrix.length; i++) {
            int newArea = w[i]*matrix[i];
            area = Math.max(area,newArea);
        }
        return area ;
    }
    static int[] nextSmallerIndex(int[]matrix){
        Stack<Integer> stack = new Stack<>() ;
        stack.push(matrix.length);
        int[]ans = new int[matrix.length];
        for (int i = matrix.length-1; i >=0  ; i--) {

            while (stack.peek() != matrix.length && matrix[i]<=matrix[stack.peek()]){
                stack.pop() ;
            }
            ans[i] = stack.peek() ;
            stack.push(i);
        }
        return ans ;
    }
    static int[] prevSmallerIndex(int[]matrix){
        Stack<Integer> stack = new Stack<>() ;
        stack.push(-1);
        int[]ans = new int[matrix.length];
        for (int i = 0; i <matrix.length  ; i++) {

            while (stack.peek() != -1 && matrix[i]<=matrix[stack.peek()]){
                stack.pop() ;
            }
            ans[i] = stack.peek() ;
            stack.push(i);
        }
        return ans ;
    }
}
