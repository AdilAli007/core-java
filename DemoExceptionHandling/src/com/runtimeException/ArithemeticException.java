package com.runtimeException;

public class ArithemeticException {
    public static void main(String[] args) {
        try {
            int num = 10;
            int num2 = 0;
            int result = num / num2;
            System.out.println("Result:" + result);
        } catch (Exception e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }

}