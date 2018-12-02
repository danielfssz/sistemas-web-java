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
 * @author aluno
 */
public interface IClienteDAO {

    public void adicionar(Cliente cliente);

    public void alterar(Cliente cliente);

    public void excluir(String login);

    public Usuario getById(Integer id) throws SQLException;

    public List<Cliente> listar();

}
