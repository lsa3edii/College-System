package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {
    
    private static Connection connection = null;
    private static String url;
    
    public Database() {
        //
    }
    
    public static Connection getConnect() {
        url = "jdbc:sqlserver://LSA3EDII\\SQLEXPRESS;databaseName=CollegeSystem;"
                + "integratedSecurity=true;encrypt=false";
        
        try {
            connection = DriverManager.getConnection(url);
            return connection;

        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }
    
}
