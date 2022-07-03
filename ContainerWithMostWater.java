package com.example.mypackage;

import java.util.*;
import java.util.Map;


public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(arr));

    }

    public static int maxArea(int[] height) {

        int maxVolume = 0;
        int left = 0;
        int right = height.length - 1;


        while(left < right) {
            int width = right - left;

            maxVolume = Math.max(maxVolume, Math.min(height[left], height[right]) * width);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxVolume;
    }
}



