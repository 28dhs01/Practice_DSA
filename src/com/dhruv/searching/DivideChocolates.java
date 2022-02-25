package com.dhruv.searching;
//https://curiouschild.github.io/leetcode/2019/06/21/divide-chocolate.html
public class DivideChocolates {
    public static void main(String[] args) {
//        solution not working
        int[] sweetness = {1,2,3,4,5,6,7,8,9};
        int K = 5 ;
        int ans = maximizeSweetness(sweetness,K);
        System.out.println(ans);
    }
//    static int maximizeSweetness(int[] sweetness, int K) {
//        // write your code here
//
//        int s = Integer.MAX_VALUE;
//        int e = 0;
//        for( int sweet : sweetness){
//            s = Math.min(sweet,s);
//            e += sweet ;
//        }
//        while (s<e ){
//            int m = s+(e-s)/2  ;
//            int friends = 1 ;
//            int sum = 0 ;
//            for( int i = 0 ;i < sweetness.length ; i++ ){
//                if( sweetness[i]+sum > m ){
//                    friends++ ;
//                    sum = sweetness[i];
//                }else{
//                    sum += sweetness[i];
//                }
//            }
//            if( friends >= K + 1 ){
//                s = m ;
//            }else{
//                e = m - 1 ;
//            }
//        }
//        return s ;
//    }

    public static int maximizeSweetness(int[] nums, int m) {
        m++;
        long l = Integer.MAX_VALUE, r = 0;
        for(int n : nums) {
            r += n;
            l = Math.min(l, n);
        }
        while(l+1 < r) {
            long mid = l + (r-l) / 2;
            if(canSplit(nums, m, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if(canSplit(nums, m, r)) return (int)r;
        else return (int)l;
    }
    public static boolean canSplit(int[] nums, int m, long target) {
        long sum = 0, cnt = 0;
        for(int n : nums) {
            if(sum + n >= target) {
                sum = 0;
                cnt++;
            } else {
                sum += n;
            }
        }
        return cnt >= m;
    }
}
