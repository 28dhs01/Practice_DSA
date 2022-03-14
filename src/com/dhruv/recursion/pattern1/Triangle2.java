package com.dhruv.recursion.pattern1;

public class Triangle2 {
    public static void main(String[] args) {
//        triangle2(4,0);
        triangle2OtherWay(4,0,4);
    }
    static void triangle2(int r ,int c ){
        // base case
        if( r == 0 ){
            return;
        }
        // body and calls
        if( c < r ){
            triangle2(r,c+1);
            System.out.print("* ");
        }
        else{
            triangle2(r-1,0);
            System.out.println();
        }
    }
    static void triangle2OtherWay(int row , int col, int n ){
//        base case
        if( row == 0 ){
            return ;
        }
//        body
        if( row+col <= n ){
            System.out.print("*");
            triangle2OtherWay(row,col+1,n);
        }else{
            System.out.println();
            triangle2OtherWay(row-1,0,n);
        }
    }
}
