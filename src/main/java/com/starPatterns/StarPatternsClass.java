package com.starPatterns;

public class StarPatternsClass {
    public static void main(String[] args) {

       // callToPrintStarPattern();//from 1 to 3
        //from 4 onwards
        //callToPattern4();

        //from 9 onwards
        callToPattern9();
    }

    /**
     * Pattern 9.
     *
     * 1111111
     *  11111
     *   111
     *    1
     *
     *  */
    private static void callToPattern9() {
        System.out.println("Pattern 9.");
        //its simple first outer loop is designated row counter
        //whatever be the desired number of rows run it that many times
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) { //this loop is to control spaces
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /**
     * Pattern 1.
     * 1
     * 11
     * 111
     * 1111
     * 11111
     *
     * Pattern 2.
     * 11111
     * 1111
     * 111
     * 11
     * 1
     *
     * Pattern 3.
     * 1
     * 11
     * 111
     * 1111
     * 11111
     * 1111
     * 111
     * 11
     * 1
     * */
    private static void callToPrintStarPattern() {
        //pattern 1
        System.out.println("Pattern 1.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //pattern 2
        System.out.println("Pattern 2.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //pattern 3
        System.out.println("Pattern 3.");
        //Pattern 3 can be created by combining above 2 patterns
        //some change were needed to be done for making the highest number of star line
        //to be print once
        //Hence I am not writing the solution here for pattern 3

        callToPattern4();

    }

    /**
     * Pattern 4.
     *     1
     *    11
     *   111
     *  1111
     *
     *  Pattern 5
     *  1111
     *   111
     *    11
     *     1
     *
     *    Pattern 6.
     *    It is the combination of the pattern 4 & 5
     *    hence not writing the solution of it
     *
     *    Pattern 7.
     *        1
     *       1 1
     *      1 1 1
     *     1 1 1 1
     *    1 1 1 1 1
     *
     *    Pattern 8.
     *
     *       1
     *      111
     *     11111
     *    1111111
     * */
    private static void callToPattern4() {
        //Pattern 4
        System.out.println("Pattern 4.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i+j >= 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        //Pattern 5
        System.out.println("Pattern 5.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Pattern 7
        System.out.println("Pattern 7.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Pattern 8.
        System.out.println("Pattern 8.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j < ((2*i)+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
