/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Elienai
 */
public interface IUsuarioDAO {
    
    public void adicionar (Usuario usuario);
    public void alterar (Usuario usuario);
    public void excluir(String login);
    public Usuario getByLogin(String login) throws SQLException;
    public List<Usuario> listar();
            
    
}
