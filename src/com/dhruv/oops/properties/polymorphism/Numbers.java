package com.dhruv.oops.properties.polymorphism;

public class Numbers {
//    both add() have same name
//    but parameters are different in both cases
//    this is compile time polymorphism
//    different constructors of same class is also prime eg. of compile time polymorphism
//    this is called as overloading
    int add( int a, int b){
        return a+b ;
    }
    int add(int a, int b, int c){
        return a+b+c ;
    }
//    the below greeting method is also eg. of compile time polymorphism
    void greeting(String firstName,int age){
        System.out.println("hello "+firstName);
    }
    void greeting(int time , String firstName){
        System.out.println("hello "+firstName);
    }

    @Override
    public String toString() {
        return "here it is eg. to show run time polymorphism using overriding";
    }
}
class Main {
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.add(10,15);
        obj.greeting("Dhruv",22);
        System.out.println(obj);
    }
}
