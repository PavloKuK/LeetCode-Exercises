package com.example.mypackage;

import java.util.*;
import java.util.Map;


public class ValidParentheses {

    public static void main(String[] args) {

        String str = "()";

//        isValid(str);

        if (isValid(str)) {
            System.out.println("Valid");
        } else if(!isValid(str)) {
            System.out.println("Not Valid");
        }
    }

    private static final Map<Character, Character> map  = Map.of('(', ')', '{', '}', '[', ']');

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        char[] ch = s.toCharArray();

        if (ch[0] == ')' || ch[0] == '}' || ch[0] == ']') {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (map.get(open) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}



