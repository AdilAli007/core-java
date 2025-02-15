package com.StringClass;

import java.util.Arrays;

public class StringClassMethods {
    public static void main(String[] args) {
        String name = "Aadil Ali";
        String name1 = "Ali";
        int number = 102;

        System.out.println("<<<<Length Method>>>>");
        System.out.println("length Method: "+name.length());

        System.out.println("<<<<isEmpty Method>>>>");
        System.out.println("isEmpty Method: "+name.isEmpty());

        System.out.println("<<<<trim Method>>>>");
        System.out.println("trim Method: "+name.trim());

        System.out.println("<<<<equals Method>>>>");
        System.out.println("equals Method: "+name.equals(name1));

        System.out.println("<<<<equalsIgnoreCase Method>>>>");
        System.out.println("equalsIgnoreCase: "+name.equalsIgnoreCase(name1));

        System.out.println("<<<<compareTo & compareToIgnoreCase Method>>>>");
        System.out.println("compareTo: "+name.compareTo(name1));
        System.out.println("compareToIgnoreCase: "+name.compareToIgnoreCase(name1));

        System.out.println("<<<<concat Method>>>>");
        System.out.println("concat: "+name.concat(name1));

        System.out.println("<<<<join Method>>>>");
        System.out.println("join: "+String.join("/",name,name1));

        System.out.println("<<<<subSequence Method>>>>");
        System.out.println("subSequence: "+name.subSequence(2,5));

        System.out.println("<<<<subString Method>>>>");
        System.out.println("subString: "+name.substring(3));
        System.out.println("subString: "+name.substring(0,3));

        System.out.println("<<<<replace, replaceFirst & replaceAll Methods>>>>");
        System.out.println("replace: "+name.replace("Aadil","aadil"));
        System.out.println("replaceFirst: "+name.replaceFirst("a","A"));
        System.out.println("replaceAll: "+name.replaceAll("a(.)","A"));

        System.out.println("<<<<indexOf & lastIndexOf Method>>>>");
        System.out.println("indexOf: "+name.indexOf("d"));
        System.out.println("lastIndexOf: "+name1.lastIndexOf("a"));

        System.out.println("<<<<charAt & contains Method>>>>");
        System.out.println("charAt: "+name.charAt(4));
        System.out.println("contains: "+name.contains("ad"));

        System.out.println("<<<<split Method>>>>");
        System.out.println("split: "+name.split(":"));

        System.out.println("<<<<startsWith & endsWith Method>>>>");
        System.out.println("startsWith: "+name.startsWith("A"));
        System.out.println("endsWith: "+name1.endsWith("li"));

        System.out.println("<<<<toUpperCase & toLowerCase Method>>>>");
        System.out.println("toUpperCase: "+name.toUpperCase());
        System.out.println("toLowerCase: "+name1.toLowerCase());

        System.out.println("<<<<valueOf & toCharArray Method>>>>");
        System.out.println("valueOf: "+String.valueOf(number));
        char [] array = name.toCharArray();
        System.out.println("toCharArray: "+ Arrays.toString(array));

    }
}
