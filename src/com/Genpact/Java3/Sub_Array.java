package com.Genpact.Java3;

public class Sub_Array {
    public static void main(String[] args) {
        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};

        int start = -1;
        int end = -1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                start = i;
                break;
            }
        }

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                end = i;
                break;
            }
        }

        if (start != -1 && end != -1) {
            System.out.println("The subarray lies between the indexes " + start + " and " + end);
        } else {
            System.out.println("No subarray found.");
        }
    }
}

