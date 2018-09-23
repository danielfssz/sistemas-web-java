/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.prova.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class UsuarioDAO {

    private Connection cn;

    public UsuarioDAO() throws ClassNotFoundException {
        cn = new FabricaConexao().getConnection();
    }

    public Usuario getByLogin(String login) throws SQLException {
        Usuario item = null;
        ResultSet results;

        try {
            String sql = "Select * from usuario where login='" + login + "';";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                item = new Usuario();
                item.setId(Integer.parseInt(results.getObject("id").toString()));
                item.setNome(results.getObject("nome").toString());
                item.setLogin(results.getObject("login").toString());
                item.setSenha(results.getObject("senha").toString());

            }

            return item;

        } catch (SQLException e) {
            throw e;
        }
    }

    public List<Usuario> Lista() {
        List<Usuario> lista = new ArrayList<Usuario>();
        ResultSet results;
        try {
            String sql = "Select * from usuario;";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                Usuario item = new Usuario();
                item.setId(Integer.parseInt(results.getObject("id").toString()));
                item.setNome(results.getObject("nome").toString());
                item.setLogin(results.getObject("login").toString());
                item.setSenha(results.getObject("senha").toString());

                lista.add(item);

            }

            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
