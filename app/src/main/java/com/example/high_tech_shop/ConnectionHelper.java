package com.example.high_tech_shop;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    Connection conn;
    String username, pass, ip, port, database;
    public Connection connectionClass(){
        ip = "34.45.104.76";
        database = "HighTechShop";
        port = "1432";
        username = "sqlserver";
        pass = "12345";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectURL = null;

        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectURL = "jdbc:jtds:sqlserver://"+ip+":"+port+";databasename="+database+";user="+username+";password="+pass+";";
            connection = DriverManager.getConnection(ConnectURL);
        }catch (Exception e){

        }
        return connection;
    }
}
