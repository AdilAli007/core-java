package com.StringClass;

public class StringConstructor {
    public static void main(String[] args){
        String str1 = "Aadil";      // 1 Object
        String str2 = new String("Aadil");      // 2 Object

        StringBuffer stringBuffer = new StringBuffer("Aadil");      //mutable object
        String str3 = new String(stringBuffer);     //immutable object and passing stringBuffer in string constructor

        StringBuilder stringBuilder = new StringBuilder("Aadil");
        String str4 = new String(stringBuilder);        // passing stringBuilder in string constructor

        byte [] b = {101,102,103};
        String str5 = new String(b);        // passing byte array in string constructor

        char [] c = {'a', 'b', 'c'};
        String str6 = new String(c);        // passing char array in string constructor

        System.out.println("str1 "+str1);
        System.out.println("str2 "+str2);
        System.out.println("str3 "+str3);
        System.out.println("str4 "+str4);
        System.out.println("str5 "+str5);
        System.out.println("str6 "+str6);



    }
}
