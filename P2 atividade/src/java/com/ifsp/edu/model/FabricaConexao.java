/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author aluno
 */
public class FabricaConexao {
    public Connection getConnection() throws ClassNotFoundException {
        
        try{
      
        	
       
       // return DriverManager.getConnection("jdbc:mariadb://localhost:3306/localhost/cadastro", "root", "");
        	//Class.forName("com.mysql.jdbc.Driver");
        	Class.forName("com.mysql.jdbc.Driver");
        	 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", "");
        			 //DriverManager.getConnection("jdbc:mariadb://localhost:3306/testj?user=diego2&password=diego");
                 //System.out.println("connected");  
                 return con;
        }
        catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        
        }
    }

                
       

