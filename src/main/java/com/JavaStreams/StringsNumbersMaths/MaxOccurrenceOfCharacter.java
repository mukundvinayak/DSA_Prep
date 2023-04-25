package com.JavaStreams.StringsNumbersMaths;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MaxOccurrenceOfCharacter {
    private static int EXTENDED_ASCII_CODES = 256;
    private static Pair<Character,Integer> findCharacterWithMaxOccurrences(String str){
        int asciiCodes[] = new int[EXTENDED_ASCII_CODES];
        int maxCharVal = -1;
        char maxValChar = Character.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch)){
                int code = (int) ch;
                asciiCodes[code]++;
                if(asciiCodes[code] > maxCharVal){
                    maxCharVal = asciiCodes[code];
                    maxValChar = ch;

                }
            }
        }
        return new Pair(maxValChar,maxCharVal);
    }

    private static Pair<Character, Integer> findCharWithMaxOccurrence(String str){

        str.chars()
                .filter(ch->Character.isWhitespace(ch)==false)
                .mapToObj(ch->(char) ch)
                .collect(groupingBy(c->c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p-> new Pair(p.getKey(), p.getValue()))
                .orElse(new Pair(Character.MIN_VALUE, -1L));
        return new Pair<>('a',0);
    }
}
