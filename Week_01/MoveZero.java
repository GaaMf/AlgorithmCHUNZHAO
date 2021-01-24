package com.gaamf.snail.algorithm;

public class MoveZero {

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {1, 12};
        moveZeroes(nums);
    }
}
