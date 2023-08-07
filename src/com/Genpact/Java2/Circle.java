package com.Genpact.Java2;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
            Circle circle1 = new Circle(); // Create a circle object with default radius
            System.out.println("Radius of Circle 1: " + circle1.getRadius());
            System.out.println("Area of Circle 1: " + circle1.getArea());

            Circle circle2 = new Circle(2.5); // Create a circle object with radius 2.5
            System.out.println("Radius of Circle 2: " + circle2.getRadius());
            System.out.println("Area of Circle 2: " + circle2.getArea());
        }
    }



