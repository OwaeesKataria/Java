package com.Genpact.Java4;

class Member {
    private String Name;
    private int Age;
    String Phone_Number;
    private String Address;
    private double Salary;

    public Member(String Name, int Age, String Phone_Number, String Address, double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.Phone_Number = Phone_Number;
        this.Address = Address;
        this.Salary = Salary;
    }

    void printSalary() {
        System.out.println("Salary: " + Salary);
    }

    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public String getPhone_Number(){
        return Phone_Number;
    }
    public String getAddress(){
        return Address;
    }
    public double getSalary() {
        return Salary;
    }



}

class Employee extends Member {
    private String specialization;

    public Employee(String Name, int Age, String Phone_Number, String Address, double Salary, String specialization) {
        super(Name, Age, Phone_Number, Address, Salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
class Manager extends Member{
    String department;

    public Manager(String Name, int Age, String Phone_Number, String Address, double Salary, String department) {
        super(Name, Age, Phone_Number, Address, Salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
class Main1{
    public static void main(String[] args) {
        Employee emp = new Employee("Sam", 22, "1234567890", "Address1", 50000, "Software Engineer");
        Manager mg = new Manager("Sung", 50, "0987654321", "Address2", 100000, "HR");

        System.out.println("Employee Information:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Phone Number: " + emp.getPhone_Number());
        System.out.println("Address: " + emp.getAddress());
        emp.printSalary();
        System.out.println("Specialization: " + emp.getSpecialization());

        System.out.println("\nManager Information:");
        System.out.println("Name: " + mg.getName());
        System.out.println("Age: " + mg.getAge());
        System.out.println("Phone Number: " + mg.getPhone_Number());
        System.out.println("Address: " + mg.getAddress());
        mg.printSalary();
        System.out.println("Department: " + mg.getDepartment());

    }
}