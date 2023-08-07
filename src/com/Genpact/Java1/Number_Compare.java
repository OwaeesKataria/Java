package com.Genpact.Java1;

public class Number_Compare {

        public static void main(String[] args) {
            float num1 = 567;
            float num2 = 567;

            int roundnum1 = Math.round(num1 * 1000);
            int roundnum2 = Math.round(num2 * 1000);

            if (roundnum1 == roundnum2){
                System.out.println("The numbers are same upto 3 decimal places.");
            } else {
                System.out.println("The numbers are different.");
            }
        }

}