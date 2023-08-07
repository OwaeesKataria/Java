package com.Genpact.Java2;

public class Prime_Num_Checker {

    public static boolean isPrime(int n){
        if (n < 1) {
            return false;
        }
        if (n % 1 == 0) {
            if (n % n == 0) {
                return true;
            }
        }
        else {
            return false;
        }return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime number between 1 & 500: ");

        for (int n = 1; n <= 500; n++){
            if (isPrime(n)){
                System.out.println(n + " ");
            }
        }
    }
}
