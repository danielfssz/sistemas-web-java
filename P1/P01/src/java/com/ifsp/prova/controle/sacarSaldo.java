/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.prova.controle;

import com.ifsp.prova.model.Cliente;
import com.ifsp.prova.model.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
public class sacarSaldo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        try {
            int id = Integer.parseInt(request.getParameter("id_cliente"));
            Double valor = Double.parseDouble(request.getParameter("vl_saque"));
            String dataSaque = request.getParameter("dt_saque");

            Cliente cliente = new Cliente();
            ClienteDAO dao;
            List<Cliente> listaCliente = new ArrayList<Cliente>();

            dao = new ClienteDAO();

            cliente.setId(id);

            Cliente clienteDepositario = dao.getClienteById(cliente);

            double saldoAtual = clienteDepositario.getSaldo();

            if (saldoAtual > valor) {
                saldoAtual = saldoAtual - valor;

                clienteDepositario.setSaldo(saldoAtual);
                clienteDepositario.setDs_ultima_operacao("Saque de " + valor);
                clienteDepositario.setDt_ultima_operacao(dataSaque);
                dao.depositar(clienteDepositario);

                listaCliente = dao.listaCliente();

                request.setAttribute("listaCliente", listaCliente);

                RequestDispatcher dispatcher = request.getRequestDispatcher("lista_clientes.jsp");
                dispatcher.forward(request, response);
            }else{
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("saldoInsuficiente.jsp");
                dispatcher.forward(request, response);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(depositarSaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
