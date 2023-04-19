package com.JavaStreams.StringsNumbersMaths;

import java.util.Arrays;
import java.util.StringJoiner;

public class JoiningStringWIthDelimiter {

    public static void main(String[] args) {
        System.out.println(joinString('#', "1","2","3"));
    }
    private static String joinString(char delimiter, String...args){
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (i = 0; i < args.length - 1; i++) {
            result.append(args[i]).append(delimiter);
        }
        result.append(args[i]);
        return result.toString();
    }

    private static String joinStringWIthStringJoiner(char delimiter, String...args){
        StringJoiner sj = new StringJoiner(String.valueOf(delimiter));
        for (String str: args)
            sj.add(str);

        return sj.toString();


    }
}
