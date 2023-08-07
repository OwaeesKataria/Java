package com.Genpact.Java3;

public class Array {

    public static boolean equal(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,2,1};
        int [] arr3 = {3,7,2,7,3};

        System.out.println("Array 1 is equal when read from front & back: " + equal(arr1));
        System.out.println("Array 2 is equal when read from front & back: " + equal(arr2));
        System.out.println("Array 3 is equal when read from front & back: " + equal(arr3));


    }
}
