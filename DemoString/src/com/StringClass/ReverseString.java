package com.StringClass;

public class ReverseString {
    public static void main(String[] args) {
        String string = "mam";
        String reverse= " ";
        for(int i=string.length()-1; i>=0; i--){
            reverse = reverse + string.charAt(i);
        }
        System.out.println("Reversed String is: "+reverse);
    }
}
