/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;


/**
 *
 * @author Elienai
 */
public class DAOFactory {
    
        public static IUsuarioDAO createUsuarioDAO() throws ClassNotFoundException {
        
            return new UsuarioDAO();        
    }
}
