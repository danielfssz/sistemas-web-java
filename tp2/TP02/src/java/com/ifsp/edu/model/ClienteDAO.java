/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;

import com.ifsp.edu.controller.Criptografia;
import com.ifsp.edu.model.FabricaConexao;
import java.sql.Connection;
import com.ifsp.edu.model.Usuario;
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
public class ClienteDAO implements IClienteDAO {

    private Connection cn;

    public ClienteDAO() throws ClassNotFoundException {
        cn = new FabricaConexao().getConnection();
    }

    @Override
    public void adicionar(Cliente cliente) {
        String sql = "insert into cliente "
                + "(nome,endereco,cep, email, telefone, estado) "
                + "values (?,?,?,?,?, ?)";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCEP());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefone());
            stmt.setString(6, cliente.getEstado().getSigla());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        String sql = "update cliente set nome=?,endereco=?,cep=?,email=?, telefone=? where id=?";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setInt(4, cliente.getId());
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCEP());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefone());
            stmt.setString(6, cliente.getEstado().getSigla());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cliente getById(Cliente cliente) throws SQLException {
        Cliente item = null;
        ResultSet results;

        try {
            String sql = "Select * from cliente where id='" + cliente.getId() + "';";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                item = new Cliente();
                item.setId(Integer.parseInt(results.getObject("id").toString()));
                item.setNome(results.getObject("nome").toString());
                item.setEndereco(results.getObject("endereco").toString());
                item.setCEP(results.getObject("cep").toString());
                item.setEmail(results.getObject("email").toString());
                item.setTelefone(results.getObject("telefone").toString());
                Estado e = new Estado();
                e.setSigla(results.getObject("estado").toString());
                item.setEstado(e);

            }

            return item;

        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<Cliente>();
        ResultSet results;
        try {
            String sql = "Select * from cliente;";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                Cliente item = new Cliente();
                item.setId(Integer.parseInt(results.getObject("id").toString()));
                item.setNome(results.getObject("nome").toString());
                item.setEndereco(results.getObject("endereco").toString());
                item.setCEP(results.getObject("cep").toString());
                item.setEmail(results.getObject("email").toString());
                item.setTelefone(results.getObject("telefone").toString());

                lista.add(item);

            }

            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void excluir(Cliente cliente) {
        String sql = "delete from cliente where id = ?";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, cliente.getId().toString());
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
