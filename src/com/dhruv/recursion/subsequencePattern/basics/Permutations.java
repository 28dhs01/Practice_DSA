package com.dhruv.recursion.subsequencePattern.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// this problem is not solved till now
// below approach is wrong
// could be solved using backtracking
public class Permutations {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        ArrayList<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numsList.add(nums[i]);
        }
        List<List<Integer>> ansList = permute(numsList);
        System.out.println(ansList);


    }
    static List<List<Integer>> permute(ArrayList<Integer> numsList) {

        List<List<Integer>>outerList = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        permutations(numsList,outerList,innerList);
        return outerList;
    }
    static void permutations( ArrayList<Integer>numsList, List<List<Integer>>outerList,List<Integer>innerList  ){
//        base case
        if(numsList.size() == 0 ){
            outerList.add(innerList);
            return;
        }
//        body
        int num = numsList.get(0) ;
        for( int i = 0 ; i<innerList.size()+1 ; i++ ){
            innerList.add(i,num);
            numsList.remove(0);
            permutations(numsList,outerList,innerList);
        }
    }
}
