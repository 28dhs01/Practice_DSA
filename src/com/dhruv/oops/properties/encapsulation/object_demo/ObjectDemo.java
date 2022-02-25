package com.dhruv.oops.properties.encapsulation.object_demo;

public class ObjectDemo {
    String objName = "dhruv" ;
    int age = 10 ;
    public ObjectDemo() {
        super();
    }
    public ObjectDemo(String name, int age){
        this.objName = name ;
        this.age = age;
    }
    public ObjectDemo(int age){
        this.age = age ;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return objName;
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo() ;
        System.out.println(obj);
        System.out.println(obj.hashCode());
        ObjectDemo obj2 = obj ;
        ObjectDemo obj3 = new ObjectDemo(17);
        ObjectDemo obj4  = new ObjectDemo(17);
//        .equals() checks the value only
//        == checks the obj itself
        System.out.println(obj.equals(obj2));
        System.out.println(obj3.equals(obj4));
        System.out.println(obj3 == obj4);
        System.out.println(obj4.getClass());
    }
}
