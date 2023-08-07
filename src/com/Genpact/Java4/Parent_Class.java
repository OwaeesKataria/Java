package com.Genpact.Java4;

public class Parent_Class {
    public void print1(){
        System.out.print("This is parent class");
    }
}
class Child_Class extends Parent_Class{
    public void print2(){
        System.out.print("This is child class");
    }
}
class Main2{
    public static void main(String[] args) {
        Parent_Class p1 = new Parent_Class();
        System.out.println("Method of parent class called by object of parent class: ");
        p1.print1();
        System.out.println('\n');
        Child_Class c1 = new Child_Class();
        System.out.println("Method of child class called by object of child class: ");
        c1.print2();
        System.out.println('\n');
        System.out.println("Method of parent class called by object of child class: ");
        c1.print1();

    }
}
