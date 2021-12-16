package com.dhruv.maths;

public class Pascal_tria_n_row_sum {
    public static void main(String[] args) {
        System.out.println(row_sum(7));
    }
    static int row_sum(int n){
        // ans = 2 power (n-1)
        return 1<<(n-1);
    }
}
