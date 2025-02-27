package com.runtimeException;

public class NumberFormatException {
    public static void main(String[] args) {
        int number = 19;
        try{
            number = Integer.parseInt("Ali");
            System.out.println("Number: "+number);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("NumberFormatExceptionCaught: "+e.getMessage() );
        }
    }
}
