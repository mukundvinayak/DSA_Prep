package com.JavaStreams.StringsNumbersMaths;

import java.util.*;
import java.util.stream.Collectors;

public class RemovingDuplicateCharacters {
    public static void main(String[] args) {
        String str = "So, start with the basics, focus on specific topics, and work your way up to more complex " +
                "problems at your own pace. With consistent practice and a focused approach, you can develop your" +
                " skills and become proficient in competitive programming.";
        System.out.println(str);
        removeDupChar(str);
    }

    private static void removeDupChar(String str) {
        String result = Arrays.asList(str.split(""))
                .stream().distinct().collect(Collectors.joining());
        System.out.println(result);
    }

    private static void removeDupChar2(String str){
        StringBuilder newStr = new StringBuilder();
        for (Character ch: str.toCharArray()) {
            if(String.valueOf(ch).matches("\\s,\\,") || newStr.indexOf(String.valueOf(ch)) == -1 ){
                newStr.append(ch);
            }
        }

        System.out.println(newStr.toString());
    }
}
