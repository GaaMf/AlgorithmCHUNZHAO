package com.gaamf.snail.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class TwoNumAdd {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexValueMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int targetValue = target - value;
            if (indexValueMap.containsKey(targetValue)) {
                result[0] = i;
                result[1] = indexValueMap.get(targetValue);
            } else {
                indexValueMap.put(value, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoNumAdd twoNumAdd = new TwoNumAdd();
        int[] result = twoNumAdd.twoSum(nums, target);
        for (int value : result) {
            System.out.println(value);
        }
    }
}
