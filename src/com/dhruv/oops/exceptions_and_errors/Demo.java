package com.dhruv.oops.exceptions_and_errors;

import java.util.Scanner;

public class Demo {
//    exceptions and errors are confusing terms
//    exception -> divide by 0 , null pointer exception
//    error -> stack overflow error

    public static void main(String[] args) throws Exception {
//        int a = 10 ;
//        int b = 0 ;
//        try{
////            this is classic eg. of unchecked or run time exception
//            int c = a/b ;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//        int res = divide(5,0);
//        System.out.println(res);

        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine() ;
        if( name.equals("Dhruv")){
            throw new MyException("You are invalid !");
        }else{
            System.out.println("Thank You. You can enter the party now !");
        }
    }
    static int divide(int a, int b) throws Exception {
        if( b == 0 ){
            throw new Exception("denominator can't be zero");
        }
        return a/b ;
    }
}
