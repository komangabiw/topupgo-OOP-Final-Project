/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.*;

/**
 *
 * @author TopUpGo
 */
public class mainConnectionDB {
    public static Connection con;
    public static Statement stm;
    public static PreparedStatement pst;
    public static ResultSet rs = null;
    
    public static void koneksi(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/topupgo", "root", "");
            stm = con.createStatement();
        } catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
    }
}