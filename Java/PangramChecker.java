package com.assignment;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        //String input = "Check if the input is pangram or not";
        boolean isPangram = checkIfPangram(input);
        if (isPangram) {
            System.out.println("\"" + input + "\" - is a pangram.");
        } else {
            System.out.println("\"" + input + "\" - is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (!sentence.contains(String.valueOf(letter))) {
                return false;
            }
        }
        return true;
    }
}
