package com.dhruv.stringsAndStringBuilders.assingment.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        int n = 21 ;
        String up = n+"";
//        System.out.println(up);
//        int k = Integer.parseInt(up);
//        System.out.println(k);

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> ans = new ArrayList<>();

        permutation("",up,list);
        for(int i = 0 ; i<list.size() ;i++ ){
            int element = Integer.parseInt(list.get(i));
            ans.add(element);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < ans.size(); i++) {
            if( ans.get(i) > n ){
               list1.add(ans.get(i));
            }
        }
        if ( list1.isEmpty() ){
            System.out.println("-1");
        }
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i < list1.size(); i++) {
            min = Math.min(min,list1.get(i));
        }
        System.out.println(min);


    }

    static void permutation(String p, String up, ArrayList<String> list){
//        base case
        if( up.isEmpty() ){
            list.add(p);
            return;
        }
//        body
        char ch = up.charAt(0);
        for(int i = 0 ; i<= p.length() ; i++ ){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1),list);
        }
    }

}
class Test {
    public static void main(String[] args) {
        int n = 2147483476 ;
        char[] number = (n + "").toCharArray();
        int i ;
        int maxTillNow = number.length-1;
        for ( i = number.length-1 ;i>0 ; i-- ){
            if( number[i-1]<number[i] ){
//                swap
                if( number[i] > number[maxTillNow] ){
                    maxTillNow = i ;
                }
                swap(number,i-1,maxTillNow);
                break;
            }else{
                maxTillNow = i ;
            }
        }
        if(i == 0 ){
            System.out.println("-1");
        }
        Arrays.sort(number,i,number.length);
        long val = Long.parseLong(new String(number));
        if( val > Integer.MAX_VALUE ){
            System.out.println("-1");
        }else{
            System.out.println(val);
        }
    }
    static void swap(char[]arr, int first, int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
