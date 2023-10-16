package com.assignment;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInteger(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanValues.get(s.charAt(i));

            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }

            prevValue = curValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String rn1 = "IX";
        System.out.println("Roman: " + rn1 + " => Integer: " + romanToInteger(rn1));
        rn1 = "IV";
        System.out.println("Roman: " + rn1 + " => Integer: " + romanToInteger(rn1));
        rn1 = "X";
        System.out.println("Roman: " + rn1 + " => Integer: " + romanToInteger(rn1));
        rn1 = "IV";
        System.out.println("Roman: " + rn1 + " => Integer: " + romanToInteger(rn1));
    }
}
