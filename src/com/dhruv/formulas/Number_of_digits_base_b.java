package com.dhruv.formulas;

public class Number_of_digits_base_b {
    public static void main(String[] args) {
        int n =  15 ;
        int base = 8 ;
        System.out.println(num_of_digits(n,base));

    }static int num_of_digits(int n, int base){
        int ans = (int)(Math.log(n)/Math.log(base)) + 1 ;
        return ans ;
    }
}
