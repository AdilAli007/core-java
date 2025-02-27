package com.runtimeException;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[6]);
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:" + e.getMessage());
        }

     }
    }

