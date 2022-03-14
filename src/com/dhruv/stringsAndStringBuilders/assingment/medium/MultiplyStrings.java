package com.dhruv.stringsAndStringBuilders.assingment.medium;

public class MultiplyStrings {
    public static void main(String[] args) {
        String ans = multiply("123","456");
        System.out.println(ans);

//        char [] arr = {'2'-'0','3'-'0'};
//
//        System.out.println(arr[0]+arr[1]);
//        System.out.println(arr[1]);

    }
    public static String multiply(String num1, String num2) {
        if( num1.equals("0") || num2.equals("0")){
            return "0";
        }
        char [] c1 = num1.toCharArray();
        char [] c2 = num2.toCharArray();
        int [] ans = new int[c1.length + c2.length ];
        for ( int i = c2.length-1 ; i >= 0  ; i-- ){
            int d2 = c2[i]-'0';
            int carry = 0 ;
            for( int j = c1.length - 1 ; j>= 0 ; j-- ){
                int d1 = c1[j] -'0';
                int product = (d2*d1) + carry;
                int d3 = product%10 ;
                carry = product/10 ;
                ans[i+j+1] += d3 ;
                if( ans[i+j+1] > 9 ){
                    carry += ans[i+j+1]/10 ;
                    ans[i+j+1] = ans[i+j+1]%10 ;
                }
            }
            if( carry != 0 ){
                ans[i] = carry;
            }
        }
        String res = "";
        int start = 0 ;
        if( ans[0] == 0 ){
            start = 1 ;
        }
        for( int i = start ; i < ans.length ;i++ ){
            res = res+ans[i];
        }
        return res ;
    }
}
