package com.runtimeException;

public class StringIndexOutOfBound {
    public static void main(String[] args) {
        String str = "Hey Its Meee";

        try {
            System.out.println("Character at index 10: " + str.charAt(15));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: "+e.getMessage());
        }
    }
}