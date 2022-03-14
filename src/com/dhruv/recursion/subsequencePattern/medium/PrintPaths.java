package com.dhruv.recursion.subsequencePattern.medium;

import java.util.ArrayList;

public class PrintPaths {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        printPaths(3,3,"",list);
        System.out.println(list);
    }
    static void printPaths(int row, int col , String p , ArrayList<String> list){
//        base case
        if( row == 1 && col == 1 ){
            list.add(p);
            return;
        }
//        body
        if( row != 1 && col != 1 ){
            printPaths(row-1,col,p+'D',list);
            printPaths(row, col-1,p+'R',list);
        }
        else if(row == 1){
            printPaths(row, col-1,p+'R',list);
        }else {
            printPaths(row-1,col,p+'D',list);
        }

    }
}
