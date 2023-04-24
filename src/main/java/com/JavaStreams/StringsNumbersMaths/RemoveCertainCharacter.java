package com.JavaStreams.StringsNumbersMaths;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveCertainCharacter {
    public static void main(String[] args) {
        String str = "So, start with the basics, focus on specific topics, and work your way up to more complex " +
                "problems at your own pace. With consistent practice and a focused approach, you can develop your" +
                " skills and become proficient in competitive programming.";
        System.out.println(str);
        removingACertainCharacter(str, 'o');
    }

    private static void removingACertainCharacter(String str,Character chr ){
        String result = Arrays.asList(str.split(""))
                .stream()
                .map(ch-> {
                    return String.valueOf(chr).equals(String.valueOf(ch))?"":ch;
                }).collect(Collectors.joining());
        System.out.println(result);
    }
}
