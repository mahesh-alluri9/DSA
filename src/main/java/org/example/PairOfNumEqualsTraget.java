package org.example;

public class PairOfNumEqualsTraget {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 11, 15};

        int target = 15;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                System.out.println(true);
                System.out.println(nums[start] + "," + nums[end]);
            } else {
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
    }
}
