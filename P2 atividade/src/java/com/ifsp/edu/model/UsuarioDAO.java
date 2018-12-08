/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;


import com.ifsp.edu.controller.Criptografia;
import  com.ifsp.edu.model.FabricaConexao;
import java.sql.Connection;
import  com.ifsp.edu.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class UsuarioDAO implements IUsuarioDAO{
    private Connection cn;
    
    public UsuarioDAO() throws ClassNotFoundException{
       cn=new FabricaConexao().getConnection();
    }
    
       
    public Usuario getByLogin(String login)  throws SQLException{
    	Usuario item=null;
    	ResultSet results;
    	
    	try {
    					String sql="Select * from usuario where login='" + login + "';";
    		
    					PreparedStatement stmt = cn.prepareStatement(sql);    					
    					 results = stmt.executeQuery();
    					 
    					 while (results.next())
    					 {
                                                 item=new Usuario();
    						 item.setId(Integer.parseInt(results.getObject("id").toString()));
    						 item.setNome(results.getObject("nome").toString());
    						 item.setLogin(results.getObject("login").toString());
                                                 
                                                 if (results.getObject("senha")!=null){
                                                    item.setSenha(results.getObject("senha").toString());
                                                 }
                                                 
    					 }
    				
    					
    					 
    			
    		return item;
    		
    	}
    	catch(SQLException e) {
    		throw e;
    	}
    	}

    @Override
    public void adicionar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


    
    
}
