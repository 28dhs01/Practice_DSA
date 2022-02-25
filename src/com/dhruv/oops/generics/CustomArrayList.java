package com.dhruv.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
//    i can't manipulate the []data  outside this class, hence should be private
    private int[]data ;
    private int DEFAULT_SIZE = 5 ;
//    here size is also working as index of []data
    private int size = 0 ;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int val){
        if( isFull() ){
            resize();
        }
        data[size] = val ;
        size++ ;
    }
    public int size(){
        return size ;
    }
    public int remove(){
        int removedItem = data[size];
        size--;
        return removedItem ;
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index, int val){
        data[index] = val ;
    }

    @Override
    public String toString() {
        return ""+Arrays.toString(data)+"";
    }

    private void resize() {
        int[]temp = new int[2*size];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp ;
    }

    private boolean isFull() {
        return size == DEFAULT_SIZE ;
    }
}
class Main{
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(8);
//        list.size();
//        list.get(0);
//        list.set(1,10);
//        list.remove();

        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.size());
        System.out.println(list);
        list.remove();
        list.add(8);
        System.out.println(list.get(3));
        list.set(2,10);
        System.out.println(list.size());
        System.out.println(list);
    }
}
