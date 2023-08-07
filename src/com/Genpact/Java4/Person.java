package com.Genpact.Java4;
class Person {
    private static String firstName;
    private static String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }
}
class Employee1 extends Person{

    private static String JobTitle;
    public Employee1 (String firstName, String lastName, String JobTitle) {
        super(firstName, lastName);
        Employee1.JobTitle = JobTitle;
    }

    public static String getJobTitle() {
        return JobTitle;
    }

    public static String getLastName(){
        return Person.getLastName();
    }

}
class main_{
    public static void main(String[] args) {
        Person p1 = new Person("Sam", "Sung");
        Employee1 emp = new Employee1("Google", "Pixel", "Contractor");
        System.out.println("Person: " + Person.getFirstName() + " " + Person.getLastName());
        System.out.println("Employee: " + Employee1.getJobTitle());
    }
}
