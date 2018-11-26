/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class ClienteDAO {
    
    private Connection cn;
    
    public ClienteDAO() throws ClassNotFoundException{
       cn=new FabricaConexao().getConnection();
    }
    
       
    public void adicionar (Cliente cliente){
        String sql="insert into cliente " +
                "(nome,endereco,cep,email,telefone,estado) " +
                "values (?,?,?,?,?,?)";
        
         try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);
            
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getEndereco());
            stmt.setString(3,cliente.getCep());
            stmt.setString(4,cliente.getEmail());
            stmt.setString(5,cliente.getTelefone());
            stmt.setString(6,cliente.getEstado());
 
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
    
}
