/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifsp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
public class servletCalculo extends HttpServlet {

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
            String calculo = request.getParameter("op");
            Float n1 = Float.parseFloat(request.getParameter("n1"));
            Float n2 = Float.parseFloat(request.getParameter("n2"));
            
            if (calculo.equals("1")){
                Float soma = n1 + n2;
                request.getSession().setAttribute("resultado", Float.toString(soma));
                request.getSession().setAttribute("calculo", "soma");
                response.sendRedirect("result.jsp");
            }
            else if (calculo.equals("2")){
                Float sub = n1 - n2;
                request.getSession().setAttribute("resultado", Float.toString(sub));
                request.getSession().setAttribute("calculo", "subtração");
                response.sendRedirect("result.jsp");
            }
            else if (calculo.equals("3")){
                Float mult = n1 * n2;
                request.getSession().setAttribute("resultado", Float.toString(mult));
                request.getSession().setAttribute("calculo", "multiplicação");
                response.sendRedirect("result.jsp");
            }
            else if (calculo.equals("4")) {
                Float div = n1 / n2;
                request.getSession().setAttribute("resultado", Float.toString(div));
                request.getSession().setAttribute("calculo", "divisão");
                response.sendRedirect("result.jsp");
            }
            
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
