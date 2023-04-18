package com.JavaStreams.StringsNumbersMaths;
/**
 * Counting occurrences of a certain character: Write a program that counts the
 * occurrences of a certain character in a given string.
 *
 * Solution to this problem is pretty simple and clever
 * minus the string length after replacing that certain character from the whole string length
 * using str.replace(what, with)
 *          OR
 *  brute force method of traversing the string through loop and trace the certain character with a counter
 * */
public class CountingOccurencesOfACertainCharacter {
    public static void main(String... args){
        char ch = 'a';
        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println(getCountForCharInStr(ch, str));
    }
    private static long getCountFor(char ch, String str){
     return  str.chars()
                .filter(c->c==ch)
                .count();
    }

    private static long getCountForCharInString(char ch, String str){
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    private static long getCountForCharInStr(char ch, String str){
       long count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) ==  ch)
                count++;
        }
        return count;
    }
}
