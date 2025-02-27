package com.compileTimeException;
import java.io.FileReader;

public class IOException {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("file.txt");
        }
        catch (Exception e){
            System.out.println("Error Occured: "+e.getMessage());
        }
    }
}
