package org.example;

public class ArraysExamples {
    public static void main(String[] args) {

        // int[] ints = {1, 3, 5, 2, 4};

        // To find the maximum element

       /* int currVal = 0;
        for(int i = 0; i < ints.length - 1 ; i++){
            int val = ints[i];
            if(currVal < val){
                currVal = val;
            }
        }
       // System.out.println(currVal);
    }*/

        // Reverse the Array

        /*int[] ints = {1, 3, 5, 2, 4};

        int start = 0;
        int end = ints.length - 1;

        while(start < end){
            int val = ints[start];
            ints[start] = ints[end];
            ints[end] = val;

            start ++;
            end --;
        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }*/


        // Check the Palindrome
        /*int[] ints = {1, 3, 5, 3, 1};

        int start = 0;
        int end = ints.length - 1;

        while (start < end) {
           if(ints[start] == ints[end]){
               System.out.println("It's a palindrome");
               start ++;
               end --;
           }else{
               System.out.println("It's not palindrome");
               break;
           }
        }*/

        //Second Largest element in array

       /* int[] ints = {3, 1, 7, 4, 9, 5, 8, 21, 45};

        int max = Math.max(ints[0], ints[1]);
        int secMax = Math.min(ints[0], ints[1]);
        for (int i = 2; i < ints.length; i++) {
            if (ints[i] > max) {
                if (ints[i] > secMax) {
                    secMax = max;
                }
                max = ints[i];
            } else {
                secMax = ints[i];
            }
        }
        System.out.println(secMax);*/

        // Check the Ascending Order

       /* int[] nums = {1, 2, 3, 8, 5, 6};
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) break;
            //System.out.println("True");
            // System.out.println("False");
            flag = nums[i] > nums[i + 1];
        }
        System.out.println(flag);*/


        // Remove Duplicates in sorted array

        /*int[] ints = {1, 1, 2, 2, 3, 3, 4};

        int i = 0;

        for (int j = 1; j < ints.length; j++) {
            if(ints[i] != ints[j]){
                i++;
                ints[i] = ints[j];
            }
        }
        System.out.println(ints.length);*/

        // Move 0 to end

       /* int[] nums = {0, 1, 0, 3, 12};

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        while (counter < nums.length) {
            nums[counter] = 0;
            counter++;
        }

        for (int num : nums) {
            System.out.println(num);
        }*/

        // Remove the given int from the array

       /* int[] nums = {1, 2, 2, 2, 3, 4, 5, 2, 2, 6, 7, 8, 2, 2, 2, 2, 2, 2, 8};
        int val = 2;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                counter++;
            }
        }
        System.out.println(counter);*/

        // Left rotate the array with k positions

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};




    }
}
