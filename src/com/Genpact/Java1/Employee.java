package com.Genpact.Java1;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee (String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double getSalary(){
        return salary;
    }

    public void CalSalaryInc(double percent){
        double incamt = salary * percent /100;
        salary += incamt;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Sharma", "Builder", 50000);

        System.out.println("Initial Information:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: INR " + emp.getSalary());

        double Percent = 10;
        emp.CalSalaryInc(Percent);
        System.out.println('\n');
        System.out.println("After " + Percent + "% Salary Increase:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: INR " + emp.getSalary());

    }
}
