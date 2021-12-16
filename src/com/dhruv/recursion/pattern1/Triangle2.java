package com.dhruv.recursion.pattern1;

public class Triangle2 {
    public static void main(String[] args) {
        triangle2(4,0);
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
}
