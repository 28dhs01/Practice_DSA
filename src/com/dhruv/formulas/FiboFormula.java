package com.dhruv.formulas;

public class FiboFormula {
    public static void main(String[] args) {
        int n = 50 ;
        int ans = fiboFormula(n) ;
        System.out.println(ans);
    }
    static int fiboFormula(int n){
        double a = (1+Math.sqrt(5))/2;
        double aa = (1-Math.sqrt(5))/2 ;
        double ans = Math.pow(a,n) - Math.pow(aa,n);
        double finalAns = ans/Math.sqrt(5);
        return (int)(finalAns);
    }
}
