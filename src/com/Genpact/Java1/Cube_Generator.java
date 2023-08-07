package com.Genpact.Java1;
import java.util.Scanner;
public class Cube_Generator {
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Cube of integers upto " + n + ": ");

        for(int i = 1; i <= n; i++){
            int j = i * i * i;
            System.out.println("The cube of "+ i + ": " + j);
        }

    }
}
