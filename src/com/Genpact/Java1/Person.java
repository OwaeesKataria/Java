package com.Genpact.Java1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Alice", 30);

        System.out.println("Person 1: Name: " + p1.getName() + ", Age: " + p1.getAge());
        System.out.println("Person 2: Name: " + p2.getName() + ", Age: " + p2.getAge());

    }
}
