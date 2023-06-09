package com.JavaStreams.StringsNumbersMaths;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Counting duplicate characters: Write a program that counts duplicate characters from a given string.
 * includes special characters like @ # $  as well
 * */
public class CountingDuplicatesInString {

    public static void main(String[] args) {
        String str = "A quick brown fox jumps over the lazy dog";
        //countDuplicateCharacters(str);
        countDuplicateCharactersStreams(str);
    }

    private static void countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for(char ch: str.toCharArray()){
            result
                    .compute(ch, (k, v) -> (v==null) ? 1 : ++v);
            //Attempts to compute a mapping for the specified key and its current mapped value
            //compute(key, (key, value) -> value == null? 1 : ++value)
            // merge() can be its replacement
            // merge(key, newVal, (newVal, oldVal) -> new + old)
            // merge is preferred over compute when there is the computation you need to apply
            // is simple and binary in operation like adding and concatenating
            // compute is preferred when the computation to be applied over the key
            // was complex

        }
        System.out.println(result.toString());


    }

    private static void countDuplicateCharactersStreams(String str) {
        Map<Character, Long> result = str.chars()
                        .mapToObj(ch -> (char)ch)
                                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(result.toString());


    }


}
