package com.StringClass;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String string = "Hi i am Aadil";
        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0 ;

        for(int i = 0; i<string.length();i++)
        {
            if (string.charAt(i) == '\s')
            {
                spaceCount++;
            }
            else if (string.charAt(i) == 'A' || string.charAt(i) == 'a' || string.charAt(i) == 'E' || string.charAt(i) == 'e' || string.charAt(i) == 'I' || string.charAt(i) == 'i' || string.charAt(i) == 'O' || string.charAt(i) == 'o' || string.charAt(i) == 'U' || string.charAt(i) == 'u')
            {
                vowelCount++;
            } else if (string.charAt(i) != 'A' || string.charAt(i) != 'a' || string.charAt(i) != 'E' || string.charAt(i) != 'e' || string.charAt(i) != 'I' || string.charAt(i) != 'i' || string.charAt(i) != 'O' || string.charAt(i) != 'o' || string.charAt(i) != 'U' || string.charAt(i) != 'u')
            {
                consonantCount++;
            }
        }
            System.out.println("Total spaces count: "+spaceCount);
            System.out.println("Total vowel count: "+vowelCount);
            System.out.println("Total constant count: "+consonantCount);

    }
}
