package com.dhruv.oops.properties.abstraction.interfaces.outro;

 public class MainClass {
    public static void main(String[] args) {

//        can't create the objects of parent classes / interfaces
//        only child classes can be used
         Child dhruv = new Child() ;
         dhruv.greeting();
         dhruv.career("coder");
         dhruv.choosePartner("abc");
         System.out.println(dhruv.property);

    }
}
