package com.StringClass;

public class PalindromeString {
    public static void main(String[] args) {
        String string = "mam";
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        if (string.equals(reverse))
        {
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not Palindrome String");
        }
    }
}