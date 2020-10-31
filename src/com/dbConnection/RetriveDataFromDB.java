package com.dbConnection;

import java.sql.*;

public class RetriveDataFromDB {
    static Connection conn;
    public static void main(String[] args) throws SQLException {
        try{
            String host = "jdbc:mysql://localhost:3306/emp";
            String uname = "root";
            String upwd = "Kkanha@93";

            conn = DriverManager.getConnection(host, uname, upwd);
//            Statement stat = conn.createStatement();
//            ResultSet rs = stat.executeQuery("select * from synechron");
//            while(rs.next()){
//                System.out.println("Name " + rs.getString("name") + " location " + rs.getString("location")
//                        + " salary " + rs.getString("salary"));
            PreparedStatement prep = conn.prepareStatement("insert into synechron values('Ramesh','mum',50000)");
            prep.executeUpdate();



        }catch(Throwable t){

        }finally {
            conn.close();

        }
    }
}
