package com.dhruv.recursion.backtracking;

public class CountPaths {
    public static void main(String[] args) {
        int ans  = pathCount(3,3);
        System.out.println(ans);
        printPaths("",3,3);
    }
    static int pathCount(int r, int c){
        // base case
        if( r == 1 || c == 1 ){
            return 1 ;
        }
        // body and calls
        int left = pathCount(r,c-1);
        int right = pathCount(r-1,c);
        return left+right ;
    }
    static void printPaths(String p, int r, int c){
        // base case
        if( r ==1 && c==1 ){
            System.out.println(p);
        }
        // body and calls
        if( c>1 ){
            printPaths(p+'R',r,c-1);
        }
        if( r>1 ){
            printPaths(p+'D',r-1,c);
        }
    }
}
