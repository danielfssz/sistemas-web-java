/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.controller;

import com.ifsp.edu.model.Veiculo;
import com.ifsp.edu.model.VeiculoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
public class alterarVeiculo extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet alterarVeiculo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet alterarVeiculo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);
        try {
            Veiculo vecNull = new Veiculo();
            vecNull.setId(Integer.parseInt(request.getParameter("id")));

            VeiculoDAO dao = new VeiculoDAO();
            Veiculo veiculo = dao.getById(vecNull);

            request.setAttribute("veiculo", veiculo);
            RequestDispatcher dispatcher = request.getRequestDispatcher("veiculo_alterar.jsp");
            dispatcher.forward(request, response);

        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
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
            Veiculo veiculo = new Veiculo();
            veiculo.setModelo(request.getParameter("modelo"));
            veiculo.setAno(Integer.parseInt(request.getParameter("ano")));
            veiculo.setCor(request.getParameter("cor"));
            veiculo.setPlaca(request.getParameter("placa"));
            veiculo.setId(Integer.parseInt(request.getParameter("id")));

            VeiculoDAO dao = new VeiculoDAO();
            dao.alterar(veiculo);

            List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
            listaVeiculo = dao.listar();
            request.setAttribute("listaVeiculo", listaVeiculo);

            RequestDispatcher dispatcher = request.getRequestDispatcher("veiculo_lista.jsp");
            dispatcher.forward(request, response);

        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
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
