package com.ifsp.edu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VeiculoDAO {

    private Connection cn;

    public VeiculoDAO() throws ClassNotFoundException {
        cn = new FabricaConexao().getConnection();
    }

    public void adicionar(Veiculo veiculo) {
        String sql = "insert into veiculo "
                + "(placa, modelo, cor, ano) "
                + "values (?,?,?,?,?)";

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
}
