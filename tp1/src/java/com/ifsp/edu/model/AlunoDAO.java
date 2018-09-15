/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class AlunoDAO {

    private Connection cn;

    public AlunoDAO() throws ClassNotFoundException {
        cn = new FabricaConexao().getConnection();
    }

    public void adicionar(AlunoVO aluno) {
        String sql = "insert into aluno (nome, endereco, dt_nascimento, email, nr_matricula, cpf) "
                + "values (?, ?, ?, ?, ?, ?)";
        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getDt_nascimento().toString());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getMatricula());
            stmt.setString(6, aluno.getCpf());
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<AlunoVO> lista() throws ParseException {
        List<AlunoVO> listaAlunos = new ArrayList<AlunoVO>();
        AlunoVO aluno = null;
        ResultSet results;

        String sql = "select * from aluno";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);
            results = stmt.executeQuery();

            while (results.next()) {
                aluno = new AlunoVO();
                aluno.setNome(results.getObject("nome").toString());
                aluno.setEndereco(results.getObject("endereco").toString());
                aluno.setDt_nascimento(results.getObject("dt_nascimento").toString());
                aluno.setEmail(results.getObject("email").toString());
                aluno.setMatricula(results.getObject("nr_matricula").toString());
                aluno.setCpf(results.getObject("cpf").toString());

                listaAlunos.add(aluno);
            }
            stmt.close();
            return listaAlunos;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletar(String cpf) {
        String sql = "delete from aluno where cpf = \'" + cpf + "\'";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public AlunoVO mostrarAluno(String cpf) {
        try {
            AlunoVO aluno = null;
            

            String sql = "select * from aluno WHERE cpf = " + cpf;

            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);
            
            ResultSet results  = stmt.executeQuery();
            while (results.next()) {
                aluno = new AlunoVO();
                aluno.setNome(results.getObject("nome").toString());
                aluno.setEndereco(results.getObject("endereco").toString());
                aluno.setDt_nascimento(results.getObject("dt_nascimento").toString());
                aluno.setEmail(results.getObject("email").toString());
                aluno.setMatricula(results.getObject("nr_matricula").toString());
                aluno.setCpf(results.getObject("cpf").toString());
            }
            stmt.close();
            return aluno;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void alterar(AlunoVO aluno) {
        String sql = "UPDATE aluno"
                + "SET"
                + "nome = (?), "
                + "endereco = (?), "
                + "dt_nascimento = (?), "
                + "email = (?), "
                + "matricula = (?), "
                + "cpf = (?) "
                + "WHERE cpf = (?)";

        try {
            // prepared statement para insert
            PreparedStatement stmt = cn.prepareStatement(sql);

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getDt_nascimento());
            stmt.setString(4, aluno.getEmail());
            stmt.setString(5, aluno.getMatricula());
            stmt.setString(6, aluno.getCpf());
            stmt.setString(7, aluno.getCpf());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
