package com.runtimeException;

public class NullPointerException {
    public static void main(String[] args) {
        String string = null ;
        try{
            System.out.println(string.length());
        }catch (java.lang.NullPointerException e){
            System.out.println("Null pointer exception caught: "+e.getMessage());
        }
    }
}
