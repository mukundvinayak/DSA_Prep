package com.JavaStreams.StringsNumbersMaths;

public class ContainsOnlyDigit {

    public static void main(String[] args) {

    }
    /**
     the soluting to this problem is simple by using any of the following 3 approaches:
    * 1. using regular expression checking for 0 to 9 present
     * 2. using String.matches()
     * 3. using Character.isDigit()
    */

    private static boolean containsOnlyDigitRegularExpression(String str){
        return str.matches("[0-9]+");//returns false if encountered with any non digit charater in str
    }

    private static boolean containsOnlyDigitIsDigit(String str){

        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){//condition gets true once non digit is encountered
                return false;
            }
        }
        return true;
    }

    private static boolean containsOnlyDigitIsDigitStream(String str){
        return !str.chars()
                .anyMatch(n-> !Character.isDigit(n));
    }

}
