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
 * @author aluno
 */
public class ClienteDAO {

    private Connection cn;

    public ClienteDAO() throws ClassNotFoundException {
        cn = new FabricaConexao().getConnection();
    }

    public void adicionar(Cliente cliente) {
        String sql = "insert into cliente "
                + "(nome,endereco,cep,email,telefone) "
                + "values (?,?,?,?,?)";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCep());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefone());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Cliente> listaCliente() {
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        Cliente cliente = null;
        ResultSet results;

        try {
            String sql = "select * from cliente;";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                cliente = new Cliente();
                cliente.setId(Integer.parseInt(results.getObject("id").toString()));
                cliente.setNome(results.getObject("nome").toString());
                cliente.setEndereco(results.getObject("endereco").toString());
                cliente.setCep(results.getObject("cep").toString());
                cliente.setEmail(results.getObject("email").toString());
                cliente.setTelefone(results.getObject("telefone").toString());

                listaCliente.add(cliente);
            }
            stmt.close();
            return listaCliente;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
