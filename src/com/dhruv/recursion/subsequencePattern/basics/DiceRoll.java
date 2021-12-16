package com.dhruv.recursion.subsequencePattern.basics;

import java.util.ArrayList;

public class DiceRoll {
    static int count=0 ;
    public static void main(String[] args) {
        int target = 7 ;
//        ArrayList<String> ans = diceRolls("",target,new ArrayList<>());
//        System.out.println(ans);
//        countDiceRolls("",target);
//        System.out.println(count);
        int dices = 2;
        int faces = 6;
        countDiceRollsCustomFaces("",target,dices,faces);
        System.out.println(count);
    }
    static ArrayList<String> diceRolls(String p, int target ,  ArrayList<String> list){
        if( target == 0 ){
            list.add( p );
            return list ;
        }
        for (int i = 1; i <= 6 && i<=target ; i++) {
            diceRolls(p+i,target-i,list);
        }
        return list;
    }
    static void countDiceRolls(String p, int target){
        if( target == 0 ){
            count= count+1 ;
            return ;
        }
        // body and calls
        for (int i = 1; i <= 6 && i<=target; i++) {
            countDiceRolls(p+i,target-i);
        }
    }
    static void countDiceRollsCustomFaces(String p, int target, int dices, int faces){
        if( target == 0 ){
            count= count+1 ;
            return ;
        }
        // body and calls
        for (int i = 1; i <= faces && i<=target && i<=dices; i++) {
            countDiceRollsCustomFaces(p+i,target-i,dices-1,faces);
        }
    }
}
