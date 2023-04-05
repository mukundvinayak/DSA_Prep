package com.JavaStreams.StringsNumbersMaths;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Finding the first non-repeated character:
 * Write a program that returns the first non-repeated character from a given string.*/
public class NonRepeatedCharacter {

    private static final int EXTENDED_ASCII_CODES = 256;

    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        int index = findFirstNonRepeatedCharacter(str);
        System.out.println(index+" "+str.charAt(index));
    }

    private static int findFirstNonRepeatedCharacter(String str) {

        //creation of an int array upto size of all the ASCII code
        int[] flags = new int[EXTENDED_ASCII_CODES];

        //initiating the array with -1
        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }


        //updating the index of the character in the ascii array
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        //Arrays.stream(flags).mapToObj(x-> x +" - ").forEach(System.out::println);
        //one of the many tricks to work with indices while
        //using streams
        IntStream.range(0, EXTENDED_ASCII_CODES)
                .filter(i-> flags[i]>=0)
                .mapToObj(i-> " "+i  +" - "+ flags[i] +" " + str.charAt(flags[i]) +"\n")//i is ascii code,
                //flags[i] is the index of char in str, str.charAt(flags[i]) Stream<String>
                .forEach(System.out::print);


        //comparing and getting the minimum index value wrt str
        int position = Integer.MAX_VALUE;
        System.out.println(position);
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if(flags[i]>=0){
                position = Math.min(position, flags[i]);
            }
        }
        System.out.println(position);
        //returning -1 if no non repeated character were found else the position
        return position == Integer.MAX_VALUE ? -1 : position;
    }
}
