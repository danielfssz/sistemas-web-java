package com.ifsp.edu.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public Connection getConnection() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", "modalgr");
            return con;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
