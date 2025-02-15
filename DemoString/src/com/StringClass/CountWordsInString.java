package com.StringClass;

public class CountWordsInString {
    public static void main(String[] args) {
        String string = "Hey its me Aadil";
        int count = 1;
        for(int i = 0; i<string.length()-1; i++)
        {
            if( (string.charAt(i) == '\s') && string.charAt(i+1)!='\s')
            {
                count ++;
            }
        }
        System.out.println("Number of words in a string: "+count);
    }
}
