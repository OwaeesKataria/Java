package com.Genpact.Java2;

public class Palindrome_Checker {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int testNumber1 = 5;
        System.out.println(testNumber1 + " is a palindrome? " + isPalindrome(testNumber1));

        int testNumber2 = 121;
        System.out.println(testNumber2 + " is a palindrome? " + isPalindrome(testNumber2));

        int testNumber3 = 3443;
        System.out.println(testNumber3 + " is a palindrome? " + isPalindrome(testNumber3));

        int testNumber4 = 123454321;
        System.out.println(testNumber4 + " is a palindrome? " + isPalindrome(testNumber4));

        int testNumber5 = 12345;
        System.out.println(testNumber5 + " is a palindrome? " + isPalindrome(testNumber5));
    }
}

