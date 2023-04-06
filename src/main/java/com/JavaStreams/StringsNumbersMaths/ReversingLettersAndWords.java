package com.JavaStreams.StringsNumbersMaths;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
/**
 * Reversing letters and words: Write a program that reverses the letters of each word
 * and a program that reverses the letters of each word and the words themselves.
 * */
public class ReversingLettersAndWords {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog.";
        //String reverseString = reversingLetterAndWords(str);
        String reverseString  = reversingLetterAndWordsStream(str);
        System.out.println(reverseString);
    }
    private static final Pattern PATTERN = Pattern.compile(" +");
    private static String reversingLetterAndWordsStream(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println(reversedString);
        return PATTERN.splitAsStream(reversedString)
                .map(w-> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));

    }

    private static String reversingLetterAndWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for (String word: words){
            StringBuilder reverseWord = new StringBuilder();
            for (int i = word.length()-1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reverseString.append(reverseWord).append(" ");
        }
        return reverseString.reverse().toString();
    }
}
