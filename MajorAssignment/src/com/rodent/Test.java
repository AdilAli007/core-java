package com.rodent;

public class Test {
    public static void main(String[] args) {
        Rodent[] rodents = { new Mice(), new Gerbil(), new Hamster() };
        for (int i = 0; i < rodents.length; i++) {
            Rodent rodent = rodents[i];
            rodent.nocturnal();
            rodent.size();
            rodent.chew();
            rodent.tail();
            System.out.println("<<<<>>>>");
        }
        }
    }


