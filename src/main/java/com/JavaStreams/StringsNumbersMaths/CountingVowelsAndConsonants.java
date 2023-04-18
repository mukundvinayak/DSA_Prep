package com.JavaStreams.StringsNumbersMaths;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingVowelsAndConsonants {
    public static void main(String[] args) {

    }
    private static Set<Character> allVowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

    private static Pair<Integer,Integer> countVowelsAndConsonants(String str){
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>= 'a' && str.charAt(i) <= 'z'){
                if(allVowels.contains(str.charAt(i))){
                    vowels++;
                }else{
                    consonants++;
                }

            }
        }
        return new Pair(vowels, consonants);
    }

    /**I found the following method to be very cleverly written by making use of all the new concepts of java
     * and functional programming
     * Commetary for the following will be provided in eac line
     * */
    private static Pair<Integer, Integer> countVowelsAndConsonantsStream(String str){
       Map<Boolean, Long> result =  str.chars()//converting stirng in IntStream
                .mapToObj(c-> (char) c)//mapping intStream to char
                .filter(ch -> (ch >= 'a' && ch <= 'z'))//filter out the data for valid lower case alphabet data
                .collect(//collecting data
                        //partitioningBy collects data in the form of Map with bollean key and Long value
                        Collectors.partitioningBy(c -> allVowels.contains(c), Collectors.counting())
                );

       return new Pair(result.get(true), result.get(false));

    }

    private static Pair<Integer, Integer> countVowelsAndConsonantsStream2(String str){

        str = str.toLowerCase();

        long consonants = str.chars()
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .filter(ch -> !allVowels.contains(ch))
                .count();

        long vowels = str.chars()
                .filter(ch -> allVowels.contains(ch))
                .count();

        return new Pair(vowels, consonants);
    }
}
