package com.company;

import java.sql.*;

public class DataBase {
    private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String user = "postgres";
    private static final String password = "0113echste";

    public static Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }
/*
    public static int getBusCount(){
        String sql = "SELECT COUNT(*) FROM Bus";
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);){

            rs.next();
            count = rs.getInt(1);
            }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;

    }

 */
}
