package com.dhruv.recursion.pattern1;

public class Triangle1 {
    public static void main(String[] args) {
        triangle1(4,0);
    }
    static void triangle1( int r , int c ){
        // base case
        if( r == 0 ) {
            return;
        }
        // body and calls
        if( c < r ){
            System.out.print("* ");
            triangle1(r,c+1);
        }
        else{
            System.out.println();
            triangle1(r-1,0);
        }
    }
}
