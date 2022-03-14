package com.dhruv.recursion.assignments.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 45632 ;
        int digitSum = digitSum(num);
        System.out.println(digitSum);
    }
    static int digitSum( int number ){
//        base case
        if ( number == 0 ){
            return 0 ;
        }
//        body
        int lastDigit = number%10 ;
        return lastDigit+ digitSum(number/10);
    }
}
