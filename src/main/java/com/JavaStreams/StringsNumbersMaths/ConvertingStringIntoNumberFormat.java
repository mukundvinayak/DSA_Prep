package com.JavaStreams.StringsNumbersMaths;

public class ConvertingStringIntoNumberFormat {
    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223233";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLE = "13.83423D";
    private static final String WRONG_NUMBER = "452w";

    //converting from string to respective number format
    // by using Class.valueOf  and Class.parseXXX
    public static void main(String[] args) {
        throwingExceptionWhileConvertingWrongNumber();
    }

    public void convertIntoNumberFormat(){
        //Converting String object to int primitive
        int fromINT = Integer.parseInt(TO_INT);
        long fromLONG = Long.parseLong(TO_LONG);
        float fromFLOAT = Float.parseFloat(TO_FLOAT);
        double fromDOUBLE = Double.parseDouble(TO_DOUBLE);


        //Converting String object to Float object
        Integer from_INT = Integer.valueOf(TO_INT);
        Long from_LONG = Long.valueOf(TO_LONG);
        Float from_FLOAT = Float.valueOf(TO_FLOAT);
        Double from_DOUBLE = Double.valueOf(TO_DOUBLE);

    }

    //When a String cannot be converted successfully, Java throws a NumberFormatException exception
    private static void throwingExceptionWhileConvertingWrongNumber(){
        try {
            int toWrongInt1 = Integer.parseInt(WRONG_NUMBER);
        }catch (NumberFormatException exception){
            System.err.println(exception);
        }

        try{
            Integer toWrongInt2 = Integer.valueOf(WRONG_NUMBER);
        }catch (NumberFormatException exception){
            System.err.println(exception);
        }
    }
}
