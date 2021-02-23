package com.judell.playground.leetcode.two_sums;

import java.util.HashMap;
import java.util.Map;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSums {
    public static void main(String[] args) {
        int[] x = {11, 2, 15, 34, 7, 3, 6};
        int[] t = {11, 30, 15, 34, 57};
        int target = 9;
        twoSum(x, target);
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Values that add to equal" + " " + target + ": " + nums[map.get(complement)] + " " + nums[i]);
                System.out.println("Index of values: " + map.get(complement) + " " + i);
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
