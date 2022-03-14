package com.dhruv.recursion.subsequencePattern.medium;

public class PrintPathsWithDiagonals {
    public static void main(String[] args) {
        printingPaths(3,3,"");
    }
    static void printingPaths(int row, int col ,String p){
//        base case
        if( row == 1 && col == 1 ){
            System.out.println(p);
            return;
        }
//        body
        if( row != 1 && col != 1 ){
            printingPaths(row,col-1,p+'R' );
            printingPaths(row-1,col-1,p+'d');
            printingPaths(row-1,col,p+'D');
        }
        if( row == 1 ){
            printingPaths(row,col-1,p+'R');
        }
        if( col == 1 ){
            printingPaths(row-1,col,p+'D');
        }
    }
}
