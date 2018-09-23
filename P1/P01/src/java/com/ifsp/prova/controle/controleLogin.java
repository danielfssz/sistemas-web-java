/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.prova.controle;

import com.ifsp.prova.model.Usuario;
import com.ifsp.prova.model.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elienai
 */
public class controleLogin extends HttpServlet {

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

            //validar o login antes de ir par ao menu
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

        Usuario usuario = new Usuario();
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            UsuarioDAO dao = new UsuarioDAO();

            String login = request.getParameter("login");
            String senha = request.getParameter("senha");

            usuario = dao.getByLogin(login);
            usuarios = dao.Lista();

            PrintWriter out = response.getWriter();
            if (usuario != null) {

                if (!usuario.getSenha().equals(senha)) {

                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet NewServlet</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Usuário ou Senha inválida</h1>");
                    out.println("</body>");
                    out.println("</html>");

                } else {

                    RequestDispatcher dispatcher = request.getRequestDispatcher("menu.jsp");
                    dispatcher.forward(request, response);

                }
            } else {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Sem Usuario</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Usuário nao cadatrado</h1>");
                out.println("</body>");
                out.println("</html>");

            }

            //out.println("<a href=\"login\">Formulario Cadastro</a>");
            //out.println("</body>");
            //out.println("</html>"); 
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
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