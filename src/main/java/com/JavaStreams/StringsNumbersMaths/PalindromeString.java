package com.JavaStreams.StringsNumbersMaths;

import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {

    }

    /**
     * Check whether a string is palindrome or not
     * approach 1. use meet in the middle approach using a. while loop
     * b. for-loop
     * approach 2. using stringbuilder
     * approach 3. using stream
     * */
    private static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean checkPalindromeStringbuilder(String str){
        if(str.equals(new StringBuilder(str).reverse().toString()))
            return true;
        return false;
    }

    private static boolean checkPalindromeStream(String str){
        return IntStream.range(0, str.length()/2)
                .noneMatch(i-> str.charAt(i) != str.charAt(str.length()-1-i));
    }
}
