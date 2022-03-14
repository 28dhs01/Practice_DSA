package com.dhruv.recursion.assignments.easy;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "dhruv";
        int count = lengthOfString(str);
        System.out.println(count);
//      don't use count in the function parameter with void return type. all the changes made will remain in that function only
//        because in java only pass by value is there.
//        all those changes work for arrays and other complex data types but not for strings and int
    }
    static int lengthOfString(String str){
//        base case
        if( str.isEmpty() ){
            return 0;
        }
//        body
        return 1+lengthOfString(str.substring(1));
    }

}
