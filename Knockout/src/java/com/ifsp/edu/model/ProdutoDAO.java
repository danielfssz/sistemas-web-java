package com.ifsp.edu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {

    private Connection cn;

    public ProdutoDAO() throws ClassNotFoundException {
        cn = new FabricaConexao().getConnection();
    }

    @Override
    public void adicionar(Produto produto) {
        String sql = "insert into produto (id, codigo, descricao, valor)"
                + "values (?,?,?,?)";

        try {
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, Integer.toString(produto.getId()));
            stmt.setString(2, produto.getCodigo());
            stmt.setString(3, produto.getDescricao());
            stmt.setString(4, Double.toString(produto.getValor()));

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void alterar(Produto produto) {
        String sql = "update produto set codigo = ?, descricao = ?, valor = ? where id=?";

        try {
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, produto.getCodigo());
            stmt.setString(2, produto.getDescricao());
            stmt.setString(3, Double.toString(produto.getValor()));
            stmt.setString(4, Integer.toString(produto.getId()));

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void excluir(Produto produto) {
        String sql = "delete from produto where id = ?";

        try {
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, Integer.toString(produto.getId()));

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Produto getById(Produto produto) throws SQLException {
        Produto item = null;
        ResultSet results;

        try {
            String sql = "Select * from produto where id='" + produto.getId() + "';";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                item = new Produto();
                item.setId(Integer.parseInt(results.getObject("id").toString()));
                item.setCodigo(results.getObject("codigo").toString());
                item.setDescricao(results.getObject("descricao").toString());
                item.setValor(Double.parseDouble(results.getObject("valor").toString()));
            }
            return item;

        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<Produto>();
        ResultSet results;
        try {
            String sql = "Select * from produto;";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                Produto item = new Produto();
                item.setId(Integer.parseInt(results.getObject("id").toString()));
                item.setCodigo(results.getObject("codigo").toString());
                item.setDescricao(results.getObject("descricao").toString());
                item.setValor(Double.parseDouble(results.getObject("valor").toString()));

                lista.add(item);
            }

            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
