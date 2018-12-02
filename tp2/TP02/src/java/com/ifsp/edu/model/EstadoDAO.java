/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elienai
 */
public class EstadoDAO {

    private Connection cn;

    public EstadoDAO() throws ClassNotFoundException {
        cn = new FabricaConexao().getConnection();
    }

    public List<Estado> Lista() {
        //List<Usuario> lista =new ArrayList<Usuario>();
        List<Estado> lista = new ArrayList<Estado>();
        //ResultSet results;
        ResultSet cursor;
        try {
            String sql = "Select * from estado;";

            //PreparedStatement stmt = cn.prepareStatement(sql);    
            PreparedStatement stmt = cn.prepareStatement(sql);

            cursor = stmt.executeQuery();

            while (cursor.next()) {
                Estado item = new Estado();

                item.setId(Integer.parseInt(cursor.getObject("id").toString()));
                item.setDescricao(cursor.getObject("descricao").toString());
                item.setSigla(cursor.getObject("sigla").toString());
                lista.add(item);

            }

            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
