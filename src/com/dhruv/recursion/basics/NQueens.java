package com.dhruv.recursion.basics;

import java.util.ArrayList;

public class NQueens {
    public static void main(String[] args) {
        int n = 4 ;
        boolean [][]board = new boolean[n][n];
        ArrayList<String>ans = nQueens(board,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<String> nQueens(boolean[][]board, int row, ArrayList<String>list){
        // base condition
        if( row == board.length ){
            ArrayList<String>ans = display(board, new ArrayList<>());
            System.out.println();
            return ans;
        }
        // body and calls
        for(int col = 0 ; col< board.length ; col++ ){
            if( isSafe(board,row,col)){
                board[row][col] = true ;
                nQueens(board,row+1,list);
                board[row][col] = false ;
            }
        }
        return list ;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // vertical check
        for (int i = 0; i < row; i++) {
            if(board[i][col] == true ){
                return false;
            }
        }
        // left diagonal check
        int maxLeft = Math.min(row,col);
        for( int i = 1 ; i<=maxLeft ; i++ ){
            if(board[row-i][col-i]== true){
                return false;
            }
        }
        // right diagonal check
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <=maxRight ; i++) {
            if(board[row-i][col+i] == true){
                return false;
            }
        }
        return true;
    }

    private static ArrayList<String> display(boolean[][] board,ArrayList<String>list) {
        for(boolean[] row : board){
            for(boolean element : row){
                if( element == true ){
                    list.add("Q");
                }
                else{
                    list.add(".");
                }
            }
        }
        return list;
    }
}
