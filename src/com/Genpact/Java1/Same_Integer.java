package com.Genpact.Java1;
import java.util.Scanner;
public class Same_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = sc.nextInt();

        System.out.print("Enter the fourth integer: ");
        int num4 = sc.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("All four numbers are equal.");
        } else {
            System.out.println("All four numbers are not equal.");
        }
    }
}
