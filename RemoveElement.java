package com.example.mypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};

        int val = 0;

        System.out.println(removeElement(nums, val));
    }


   public static int removeElement(int[] nums, int val) {

        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = val + 100;
                n--;
            }
        }

        Arrays.sort(nums);

        return n;
    }
}


