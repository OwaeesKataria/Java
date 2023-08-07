package com.Genpact.Java1;
import java.util.Scanner;
public class Add_Sub_Prod_Diff_Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter integer number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int prod = num1 * num2;
        double avg = (double) (num1 + num2)/ 2;
        int dist = 0;
        for (int i = num1; i < num2; i++)
            dist = dist + 1;
        int max = 0;
        if (num1 > num2){
            max = num1;
        }else {
            max = num2;
        }
        int min = 0;
        if (num1 > num2){
            min = num2;
        }else {
            min = num1;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + prod);
        System.out.println("Average: " + avg);
        System.out.println("Distance: " + dist);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
