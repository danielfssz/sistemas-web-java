/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifsp.edu.controller;

import com.ifsp.edu.model.AlunoDAO;
import com.ifsp.edu.model.AlunoVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class cadastro_aluno extends HttpServlet {

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
            AlunoDAO dao = new AlunoDAO();
            AlunoVO aluno = new AlunoVO();
            List<AlunoVO> alunos = new ArrayList<AlunoVO>();

            String nome = request.getParameter("nome");
            String endereco = request.getParameter("endereco");
            String dt_nascimento = request.getParameter("dt_nascimento");
            String email = request.getParameter("email");
            String matricula = request.getParameter("matricula");
            String cpf = request.getParameter("cpf");

            aluno.setNome(nome);
            aluno.setEndereco(endereco);
            aluno.setDt_nascimento(dt_nascimento);
            aluno.setEmail(email);
            aluno.setMatricula(matricula);
            aluno.setCpf(cpf);

            dao.adicionar(aluno);

            alunos = dao.lista();

            request.setAttribute("listaAlunos", alunos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("lista_alunos.jsp");
            dispatcher.forward(request, response);

        } catch (ClassNotFoundException | ParseException ex) {
            Logger.getLogger(cadastro_aluno.class.getName()).log(Level.SEVERE, null, ex);
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
