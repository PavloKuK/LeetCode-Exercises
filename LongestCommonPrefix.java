package com.example.mypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(str));
    }


    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String result = strs[0];

        for (int i = 1; i < strs.length; i++)

            while (strs[i].indexOf(result) != 0) {

                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        return result;

    }
}


