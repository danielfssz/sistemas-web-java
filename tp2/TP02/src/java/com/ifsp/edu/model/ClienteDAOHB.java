/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.model;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDAOHB implements IClienteDAO {

    private static ClienteDAOHB instance;
    protected EntityManager entityManager;

    public static ClienteDAOHB getInstance() {
        if (instance == null) {
            instance = new ClienteDAOHB();
        }
        return instance;
    }

    public ClienteDAOHB() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }

        return entityManager;
    }

    @Override
    public void adicionar(Cliente cliente) {

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }

    }

    @Override
    public void alterar(Cliente cliente) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public Cliente getById(Cliente cliente) throws SQLException {
        return entityManager.find(Cliente.class, cliente.getId());
    }

    @Override
    public List<Cliente> listar() {
        return entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
    }

    @Override
    public void excluir(Cliente cliente) {
        try {
            Cliente c = getById(cliente);
            remove(c);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void remove(Cliente c) {
        try {
            entityManager.getTransaction().begin();
            c = entityManager.find(Cliente.class, c.getId());
            entityManager.remove(c);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

}
