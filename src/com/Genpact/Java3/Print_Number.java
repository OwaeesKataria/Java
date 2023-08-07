package com.Genpact.Java3;

public class Print_Number {
    public void printn(int number) {
        System.out.println("Integer Number: " + number);
    }

    public void printn(double number) {
        System.out.println("Double Number: " + number);
    }

    public void printn(float number) {
        System.out.println("Float Number: " + number);
    }

    public void printn(long number) {
        System.out.println("Long Number: " + number);
    }

    public void printn(short number) {
        System.out.println("Short Number: " + number);
    }

    public void printn(byte number) {
        System.out.println("Byte Number: " + number);
    }

    public void printn(char character) {
        System.out.println("Character: " + character);
    }

    public static void main(String[] args) {
        Print_Number printer = new Print_Number();

        int intValue = 42;
        double doubleValue = 3.14;
        float floatValue = 2.71f;
        long longValue = 1234567890L;
        short shortValue = 12345;
        byte byteValue = 100;
        char charValue = 'A';

        printer.printn(intValue);
        printer.printn(doubleValue);
        printer.printn(floatValue);
        printer.printn(longValue);
        printer.printn(shortValue);
        printer.printn(byteValue);
        printer.printn(charValue);
    }
}

