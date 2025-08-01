package org.example;

import java.util.Arrays;

public class ArrayRotationByKPositions {

    public static void main(String[] args) {
        int[] ints = {1, 4, 2, 5, 3, 7, 6, 8};

        System.out.println(Arrays.toString(rverseArr(ints, 0, 4)));
        System.out.println(Arrays.toString(rverseArr(ints, 4, ints.length)));
        System.out.println(Arrays.toString(rverseArr(ints, 0, ints.length)));
    }

    public static int[] rverseArr(int[] ints, int initial, int target) {

        for (int i = initial; i < target; i++) {
            int temp = ints[i];
            ints[i] = ints[target - 1];
            ints[target - 1] = temp;
            target--;
        }
        return ints;
    }
}
