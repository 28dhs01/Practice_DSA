package com.dhruv.oops.properties.abstraction.abstractClasses;
// abstract classes -> what to do not how to do
public abstract class Parent {
   int age ;

   public Parent(){
      this.age = 0 ;
   }
   public Parent(int age) {
      this.age = age;
   }

   //   abstract classes can't have any object and static itself is independent of objects
//   can I create abstract static methods ?
//   no
//   why ?
//   static methods cannot be overridden whereas abstract classes needs to be override
   static void greet(){
      System.out.println("hey greetings from parent class");
   }
   static void normalMethod(){
      System.out.println("i am normal method of Parent class");
   }

//   this is the most important thing of the whole class here
//   abstract methods must be overridden in child classes
   abstract void career(String career);
}
