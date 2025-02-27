package com.compileTimeException;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLException {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost/STOREDB";
         String user = "root";
         String pass = "root";
        try{
           Connection con = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println("Can not connect: "+e.getMessage());
        }
    }
}
