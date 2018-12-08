package com.ifsp.edu.model;

public class DAOFactory {

    public static IProdutoDAO createProdutoDAO() throws ClassNotFoundException {

        return new ProdutoDAO();
    }
}
