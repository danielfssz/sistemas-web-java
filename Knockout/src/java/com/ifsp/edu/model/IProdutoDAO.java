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
 * @author Daniel
 */
public interface IProdutoDAO {

    public void adicionar(Produto produto);

    public void alterar(Produto produto);

    public void excluir(Produto produto);

    public Produto getById(Produto produto) throws SQLException;

    public List<Produto> listar();
}
