/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat15i1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TableUser {
    public static void main(String[] args) {
        Connection con = null;
        Statement sttm = null;
  
        try{
            Class.forName("org.sqlite.JDBC");
             con = DriverManager.getConnection("jdbc:sqlite:SQliteThang.db");
            
            sttm =con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS DangNhap (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	username text NOT NULL,\n"
                + "	password text NOT NULL\n"
                + ");";
            sttm.executeUpdate(sql);
            System.out.println("Tao Database Thanh Cong");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
