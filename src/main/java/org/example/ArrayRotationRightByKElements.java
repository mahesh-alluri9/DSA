package org.example;

import java.util.Arrays;

public class ArrayRotationRightByKElements {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        int i = 32;
        int k = i > ints.length ? i % ints.length : i;
        System.out.println(Arrays.toString(reverseArr(ints, 0, ints.length - 1)));
        System.out.println(Arrays.toString(reverseArr(ints, 0, 2)));
        System.out.println(Arrays.toString(reverseArr(ints, k, ints.length - 1)));

    }

    public static int[] reverseArr(int[] ints, int start, int end) {
        while (start < end) {
            int inti = ints[end];
            ints[end] = ints[start];
            ints[start] = inti;
            start++;
            end--;
        }
        return ints;
    }
}
