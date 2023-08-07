package com.Genpact.Java4;

abstract public class Abs_Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle1 extends Abs_Shape{
    int radius = 5;
    @Override
    void calculateArea() {
        System.out.println("The area of a circle with " + radius + " : " + (3.14 * (radius * radius)));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("The perimeter of a circle with" + radius + " : " + (2 * (3.14 * radius)));
    }
}

class Triangle extends Abs_Shape{
    int side = 8;

    @Override
    void calculateArea() {
        System.out.println("\nThe area of a triangle with " + side + " : " + (0.5 * (side * side)));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("The perimeter of a triangle with " + side + " : " + (side + side + side));
    }
}
class main3{
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        circle1.calculateArea();
        circle1.calculatePerimeter();
        Triangle triangle = new Triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
