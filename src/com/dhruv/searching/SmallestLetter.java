package com.dhruv.searching;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','g'};
        char target = 'c' ;
        char ans = smallestLetter(letters,target);
        System.out.println(ans);

    }
    static char smallestLetter(char[]letters, char target){
        int s = 0 ;
        int e = letters.length-1 ;
        while( s <= e ){
            int m = s+(e-s)/2 ;

            if( letters[ m ] > target ){
                e = m-1 ;
            }
            else{
                s = m+1 ;
            }
        }
        return letters[s%letters.length];
    }
}
