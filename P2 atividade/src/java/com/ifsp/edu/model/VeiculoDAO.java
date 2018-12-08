package com.ifsp.edu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {

    private Connection cn;

    public VeiculoDAO() throws ClassNotFoundException {
        cn = new FabricaConexao().getConnection();
    }

    public void adicionar(Veiculo veiculo) {
        String sql = "insert into veiculo "
                + "(placa, modelo, cor, ano) "
                + "values (?,?,?,?)";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setString(3, veiculo.getCor());
            stmt.setString(4, veiculo.getAno().toString());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(Veiculo veiculo) {
        String sql = "update veiculo set placa=?,modelo=?,cor=?, ano=? where id=?";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setString(3, veiculo.getCor());
            stmt.setString(4, veiculo.getAno().toString());
            stmt.setString(5, veiculo.getId().toString());
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Veiculo> listar() {
        List<Veiculo> lista = new ArrayList<Veiculo>();
        ResultSet results;
        try {
            String sql = "select * from veiculo;";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setId(Integer.parseInt(results.getObject("id").toString()));
                veiculo.setCor(results.getObject("cor").toString());
                veiculo.setModelo(results.getObject("modelo").toString());
                veiculo.setPlaca(results.getObject("placa").toString());
                veiculo.setAno(Integer.parseInt(results.getObject("ano").toString()));

                lista.add(veiculo);
            }
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void excluir(String id) {
        try {
            String sql = "delete from veiculo where id = ?;";

            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, id);
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Veiculo getById(Veiculo vecNull) {
        Veiculo item = null;
        ResultSet results;

        try {
            String sql = "Select * from veiculo where id='" + vecNull.getId() + "';";

            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                item = new Veiculo();
                item.setId(Integer.parseInt(results.getObject("id").toString()));
                item.setAno(Integer.parseInt(results.getObject("ano").toString()));
                item.setModelo(results.getObject("modelo").toString());
                item.setPlaca(results.getObject("placa").toString());
                item.setCor(results.getObject("cor").toString());
            }
            return item;

        } catch (SQLException e) {

        }
        return null;
    }
}
