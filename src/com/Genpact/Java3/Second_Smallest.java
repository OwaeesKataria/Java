package com.Genpact.Java3;
public class Second_Smallest {
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] array = {12, 2, 4, 8, 6, 20, 10};
        int secondSmallest = findSecondSmallest(array);

        System.out.println("Second smallest element: " + secondSmallest);
    }
}

