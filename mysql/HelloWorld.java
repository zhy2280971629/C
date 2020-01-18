package com.bit.mysql;

import java.sql.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        Statement stmt = null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
            stmt = connection.createStatement();
            stmt.execute("create database my_jdbc_db");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(stmt != null){
                    stmt.close();
                }
                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

