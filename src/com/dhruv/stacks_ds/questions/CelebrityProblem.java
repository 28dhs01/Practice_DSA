package com.dhruv.stacks_ds.questions;

import java.util.Stack;
//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1#
public class CelebrityProblem {
    public static void main(String[] args) {

//        int[][] M = {{0,1,0},{0,0,0},{0,1,0}};
//        int[][] M = {{0,1},{1,0}};
        int[][] M = {{0,0,0},{0,0,0},{0,0,0}};
        boolean anyCelebrity = makeCheck(M);
        System.out.println(anyCelebrity);
    }
    static boolean makeCheck( int[][]M ){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < M.length; i++) {
            stack.push(i);
        }
//
        while( stack.size() > 1 ){
//            take out 2 elements from the stack
            int a = stack.peek();
            stack.pop();
            int b = stack.peek();
            stack.pop();
//            make checks whether a know b or vice versa
            if( M[a][b]==0 && M[b][a] == 1 ){
                stack.push(a);
            }
            if( M[b][a] == 0 && M[a][b] == 1 ){
                stack.push(b);
            }
        }
        if( stack.size() == 0 ){
            return false ;
        }
        int peekElement = stack.peek() ;
        for (int i = 0; i < M.length; i++) {
            if( i!=peekElement && ( M[peekElement][i]==1 || M[i][peekElement]==0) ){
                return false ;
            }
        }
        return true ;

    }
}
class BruteforceCelebrity {
    public static void main(String[] args) {
        int[][] M = {{0,1,0},{0,0,0},{0,1,0}};
//        int[][] M = {{0,1},{1,0}};
        boolean ans = check(M);
        System.out.println(ans);

    }
    static boolean check( int[][]M ){
        for (int i = 0; i < M.length; i++) {
            boolean potentialCelebrity = true ;
            for (int j = 0; j < M[0].length; j++) {
                if( M[i][j] == 1 ){
                    potentialCelebrity = false ;
                }
            }
            if( potentialCelebrity ){
                for (int j = 0; j < M.length; j++) {
                    if( i != j ){
                        if( M[j][i] == 0 ){
                            potentialCelebrity = false ;
                        }
                    }
                }
                if( potentialCelebrity ){
                    return true ;
                }
            }
        }
        return false ;
    }
}
