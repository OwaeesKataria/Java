package com.Genpact.Java4;

public class Shape {

    public void printShape(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    public static Rectangle.Square Square;

    public void printRectangle(){
        System.out.println("This is rectangular shape");
    }
    static class Square extends Rectangle{
        public void printSquare(){
            System.out.println("Square is in Rectangle");
        }
    }
}
class Circle extends Shape{
    public void printCircle(){
        System.out.println("This is circular shape");
    }
}

class Main{
    public static void main(String[] args) {
        Rectangle.Square rs = new Rectangle.Square();
        System.out.println("Calling Shape method by the object of Square class:");
        rs.printShape();
        System.out.println('\n');
        System.out.println("Calling Rectangle method by the object of Square class:");
        rs.printRectangle();


    }
}
