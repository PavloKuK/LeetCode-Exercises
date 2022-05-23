package com.company;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {

        char[] number = s.toCharArray();

        int[] numArray = new int[number.length + 1];

        for (int i = 0; i < number.length; i++) {

            switch (number[i]) {
                case 'I' -> numArray[i] = 1;
                case 'V' -> numArray[i] = 5;
                case 'X' -> numArray[i] = 10;
                case 'L' -> numArray[i] = 50;
                case 'C' -> numArray[i] = 100;
                case 'D' -> numArray[i] = 500;
                case 'M' -> numArray[i] = 1000;
            }
        }

        int result = 0;

        for (int i = 0; i < numArray.length; i++) {

            try {
                if (numArray[i] == 0) {
                    result = result + numArray[i];
                    break;

                } else if (numArray[i] == numArray[i+1]) {
                    result = result + numArray[i];

                } else if (numArray[i] < numArray[i+1]) {
                    result = result - numArray[i];

                } else if (numArray[i] > numArray[i+1]) {
                    result = result + numArray[i];
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println();
            }
        }
        return result;
    }
}
