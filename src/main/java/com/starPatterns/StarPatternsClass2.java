package com.starPatterns;

public class StarPatternsClass2 {
    public static void main(String[] args) {
        //call2Pattern10();
        //call2Pattern12();
        //call2Pattern12Refactored();
        //call2Pattern15();
        printDiagonalOfTheSquares();
    }

    private static void call2Pattern12Refactored() {
        System.out.println("Pattern 12 Refactored Solution from web");
        for (int i = 1; i <+ 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2; j++) {
                if( j>1 && j<(i*2)-1 ){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("Pattern 13.");
        for (int i = 1; i <+ 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2; j++) {
                if( j>1 && j<(i*2)-1 ){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    /**
     *
     * 11111111
     * 1      1
     * 1      1
     * 1      1
     * 11111111*/
    private static void call2Pattern15(){
        System.out.println("Pattern 15.");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==0 || i==4 || j==0 || j==4 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     *       *
     *     *
     *   *
     * *
     *
     * *
     *   *
     *     *
     *       *
     */
    private static void printDiagonalOfTheSquares(){
        System.out.println("Pattern 16.");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i==j || i==(8-j))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * Pattern 12
     *     *
     *    * *
     *   *   *
     *  *     *
     *  */
    private static void call2Pattern12() {
        System.out.println("Pattern 12.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {//for spaces
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    //pattern 10
    /**
     * 1
     *  1
     *   1
     *    1
     *     1
     * */
    private static void call2Pattern10() {
        System.out.println("Pattern 10.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {//for spaces
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println();

        System.out.println("Pattern 11.");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }
}
