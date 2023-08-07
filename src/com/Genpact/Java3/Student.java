package com.Genpact.Java3;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Student[] std = new Student[10];

        for (int i = 0; i < std.length; i++){
            std[i] = new Student();
            std[i].setInfo("Student " + (i + 1), 10, "Address " + (i + 1));
        }
        for (int i = 0; i < std.length; i++){
            std[i].displayInfo();
        }

    }
}
