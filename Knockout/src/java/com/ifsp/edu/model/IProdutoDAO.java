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

    public void adicionar(ProdutoVO produto);

    public void alterar(ProdutoVO produto);

    public void excluir(ProdutoVO produto);

    public ProdutoVO getById(ProdutoVO produto) throws SQLException;

    public List<ProdutoVO> listar();
}
