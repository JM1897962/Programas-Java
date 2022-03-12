/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
/**
 *
 * @author famtz
 */
public class ConexionBD {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "");
        }catch (Exception e){
            System.out.println("Error: " + e); 
        }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
