package com.dhruv.maths;

import java.util.ArrayList;

public class xor {
    public static void main(String[] args) {
//        int n = 10 ;
//        int ans = xor_1_to_n(n);
//        System.out.println(ans);
//
        // xor in range
        int a = 11 ;
        int b = 21 ;
        int ans1 = xor_1_to_n(b);
        int ans2 = xor_1_to_n(a-1);
        int finalAns = ans1^ans2 ;
        System.out.println(finalAns);

        int xorVal = 0 ;
        for (int i = 11; i <= 21; i++) {
            xorVal ^= i ;
        }
        System.out.println(xorVal);

    }
    static int xor_1_to_n(int n){
        if( n%4 == 0 ){
            return n ;
        }
        if( n%4 == 1 ){
            return 1 ;
        }
        if( n%4 == 2 ){
            return n+1 ;
        }
        else{
            return 0 ;
        }
    }
}
