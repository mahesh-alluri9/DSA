package org.example;

public class MissingNumberFromArray {
    public static void main(String[] args) {
        int[] ints = {1, 2, 4, 5};
        int n = ints.length + 1;
        int sumOfArr = 0;
        int form = (n * (n + 1)) / 2;

        for (int i = 0; i < ints.length; i++) {
            sumOfArr += ints[i];
        }
        System.out.println(form - sumOfArr);

    }
}
