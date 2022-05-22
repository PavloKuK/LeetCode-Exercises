package com.company;

import java.util.Arrays;

public class TwoNum {

    public static void main(String[] args) {

        int[] nums = {5, 6, 8, 2, 1, 3};

        int target = 11;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
