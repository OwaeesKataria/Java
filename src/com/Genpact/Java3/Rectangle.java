package com.Genpact.Java3;

public class Rectangle {
    public static void main(String[] args) {
        int width = 10, height = 5;
        int perimeter = 2 * (width + height);
        int area = width * height;
        System.out.println('\n' + "Perimeter of rectangle with " + width + " width and " + height + " height is: " + perimeter + " units");
        System.out.println('\n' + "Area of rectangle with " + width + " width and " + height + " height is: " + area + " sq.units");
    }
}
