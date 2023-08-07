package com.Genpact.Java2;

public class Even_Checker {
        public static boolean isEven(int n) {
            return n % 2 == 0;
        }

        public static void main(String[] args) {
            int test_number = 8;
            System.out.println("Is " + test_number + " even? " + isEven(test_number));

        }
}
