/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.controller;

import com.ifsp.edu.model.DAOFactory;
import com.ifsp.edu.model.IUsuarioDAO;
import com.ifsp.edu.model.Usuario;
import com.ifsp.edu.model.UsuarioDAO;
import com.ifsp.edu.model.UsuarioDAOHB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
@WebServlet(name = "cadastroUsuario", urlPatterns = {"/cadastroUsuario"})
public class cadastroUsuario extends HttpServlet {

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
            out.println("<title>Servlet cadastroUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cadastroUsuario at " + request.getContextPath() + "</h1>");
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

        Usuario usuario = new Usuario();

        try {
            //UsuarioDAO dao = new UsuarioDAO();
            //IUsuarioDAO dao=new UsuarioDAOHB();
            IUsuarioDAO dao = DAOFactory.createUsuarioDAO();

            List<Usuario> usuarios = new ArrayList<Usuario>();

            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            String nome = request.getParameter("nome");

            usuario.setLogin(login);
            usuario.setNome(nome);
            usuario.setSenha(senha);

            dao.adicionar(usuario);

            usuarios = dao.listar();
            request.setAttribute("xuxa", usuarios);

            RequestDispatcher dispatcher = request.getRequestDispatcher("inicial.jsp");
            dispatcher.forward(request, response);

            //out.println("<a href=\"login\">Formulario Cadastro</a>");
            //out.println("</body>");
            //out.println("</html>"); 
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

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
        processRequest(request, response);
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
