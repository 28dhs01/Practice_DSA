package com.dhruv.arrays.medium;

import java.util.Arrays;
//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeros {
    public static void main(String[] args) {

//        int[] ar = {1,1,1};
//        System.out.println(ar);
//        System.out.println(Arrays.toString(ar));
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        solution(matrix);
//        System.out.println(Arrays.toString(matrix));
//        below code is used to print 2-d matrix
        for( int row = 0 ;row <matrix.length;row++ ){
            System.out.println(Arrays.toString(matrix[row]));
        }
    }
    static void solution(int[][]matrix){
        boolean fr = false ;
        boolean fc = false ;
        for( int i = 0 ;i<matrix.length ;i++ ){
            for( int j =0 ; j<matrix[0].length; j++ ){
                if( matrix[i][j] == 0 ){
                    if( i == 0 ){
                        fr = true ;
                    }
                    if( j ==0 ){
                        fc = true ;
                    }
                    matrix[0][j] = 0 ;
                    matrix[i][0] = 0 ;
                }
            }
        }
        for (int i = 1 ;i<matrix.length ;i++ ){
            for( int j =1 ;j<matrix[0].length ;j++ ){
                if( matrix[0][j] == 0 || matrix[i][0]==0 ){
                    matrix[i][j] = 0 ;
                }
            }
        }
        if(fr){
            for( int j = 0 ;j<matrix[0].length;j++ ){
                matrix[0][j] = 0 ;
            }
        }
        if( fc ){
            for (int i =0 ;i< matrix.length;i++ ){
                matrix[i][0] = 0 ;
            }
        }

    }
}
