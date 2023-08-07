package com.Genpact.Java1;
import java.util.Scanner;
public class Number_Type {
    public static void main(String[] args) {
        System.out.print("Enter a float-point number: ");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();

        if (n == 0){
            System.out.println("Zero");
        } if (n > 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        } if (n < 1){
            System.out.println("Small");
        } if (n > 1000000){
            System.out.println("Large");
        }

    }
}
