package com.ifsp.edu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SQLOutputImpl;

import com.ifsp.edu.model.Usuario;
import com.ifsp.edu.model.UsuarioDAO;
import java.util.ArrayList;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // pronto para gravar
        Usuario usuario = new Usuario();
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            UsuarioDAO dao = new UsuarioDAO();

            /*usuario.setNome("Joao Pedro");
usuario.setLogin("JP");
// grave nessa conex�o!!!


// m�todo elegante
dao.adicionar(usuario);*/
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
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
