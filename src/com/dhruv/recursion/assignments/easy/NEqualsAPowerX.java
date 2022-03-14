package com.dhruv.recursion.assignments.easy;

public class NEqualsAPowerX {
    public static void main(String[] args) {
//        don't make n as non-power otherwise that will throw stack overflow error
        int n = 16 ;
        int a = 2 ;
//        System.out.println(power(2,10));

        if( n==1 ){
            System.out.println(0);
        }else{
            int x = findX(n,a,1);
            System.out.println(x);
        }

    }
    static int findX(int n, int a, int x){
        int power = power(a,x);
//        base case
        if( n == power ){
            return x ;
        }
//        body
        return findX(n,a,x+1);

    }
    static int power(int a, int b){
//        base case
        if( b==0 ){
            return 1 ;
        }
//        body
        return a*power(a,b-1);

    }


}
