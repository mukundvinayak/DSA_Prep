package com.JavaStreams.StringsNumbersMaths;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        removeAllWhiteSpace(str);
    }
/**
 * The solution to this problem consists of using the String.replaceAll() method with the \s regular expression.
 * Mainly, \s removes all white spaces, including the non-visible ones, such as \t, \n, and \r*/
    private static void removeAllWhiteSpace(String str){
        str.replaceAll("\\s", "");
    }
}
