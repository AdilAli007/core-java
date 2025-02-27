package com.compileTimeException;

public class ClassNotFoundException {
    public static void main(String[] args) {
                try {
                    Class.forName("Ali");
                }
                catch (Exception e){
                    System.out.println("Class not found: "+e.getMessage());
                }
            }
        }

