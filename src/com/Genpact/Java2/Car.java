package com.Genpact.Java2;

public class Car {
    private int year;
    private String make;
    private double speed;

    public Car(int year, String make, double speed) {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car car = new Car(2015, "Honda", 85.0);
        System.out.println("Year: " + car.getYear());
        System.out.println("Make: " + car.getMake());
        System.out.println("Speed: " + car.getSpeed());
    }
}

