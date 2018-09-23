/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.prova.model;

/**
 *
 * @author aluno
 */
public class Cliente {

    int id;
    String nome;
    String endereco;
    String cpf;
    double saldo;
    String dt_ultima_operacao;
    String ds_ultima_operacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDt_ultima_operacao() {
        return dt_ultima_operacao;
    }

    public void setDt_ultima_operacao(String dt_ultima_operacao) {
        this.dt_ultima_operacao = dt_ultima_operacao;
    }

    public String getDs_ultima_operacao() {
        return ds_ultima_operacao;
    }

    public void setDs_ultima_operacao(String ds_ultima_operacao) {
        this.ds_ultima_operacao = ds_ultima_operacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
