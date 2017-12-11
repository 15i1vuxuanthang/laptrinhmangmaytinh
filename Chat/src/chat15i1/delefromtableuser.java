/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat15i1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class delefromtableuser {
    public static void main(String[] args) {
        Connection con = null;

  
        try{
            Class.forName("org.sqlite.JDBC");
             con = DriverManager.getConnection("jdbc:sqlite:SQliteThang.db");
            
            String sql = "DELETE FROM DangNhap WHERE id = ?";
            
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setInt(1, 3);
            
            pstmt.executeUpdate();
            System.out.println("Xoa Database Thanh Cong");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
