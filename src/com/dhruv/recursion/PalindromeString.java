package com.dhruv.recursion;

public class PalindromeString {
    public static void main(String[] args) {
//        String str = "dhruv";
//        String rev = reverse(str);
//        System.out.println(rev);
//        if( str.equals(rev)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }

//        StringBuilder sb =new StringBuilder();
//        sb.append("d");
//        sb.append("h");
//        System.out.println(sb.toString());

        String s = "  ";
        String newS = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for( int i = 0 ; i<newS.length() ; i++ ){
            if( newS.charAt(i) >='a' && newS.charAt(i)<='z' || (newS.charAt(i) >='0' && newS.charAt(i)<='9') ){
                sb.append(newS.charAt(i));
            }
        }
        newS = sb.toString();
        if(newS.isEmpty()){
            System.out.println("palindrome");
            return;
        }
        System.out.println(newS);
        String rev = reverse(newS);
        if( rev.equals(newS) ){
            System.out.println("palindrome");
        }else{
            System.out.println("not-palindrome");
        }

    }
    private static String reverse(String str){
        // base case
        if( str.length() == 1 ){
            return str ;
        }
        // body and calls
        char ch = str.charAt(str.length()-1);
        return ch+reverse(str.substring(0,str.length()-1));
    }
}
