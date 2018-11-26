<%-- 
    Document   : alteracao
    Created on : Apr 28, 2018, 5:05:16 AM
    Author     : Elienai
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ifsp.edu.model.UsuarioDAO"%>
<%@page import="com.ifsp.edu.model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
                   String Login =request.getParameter("login");
            String Senha =request.getParameter("senha");
            String Nome =request.getParameter("nome");
            int Id =Integer.parseInt(request.getParameter("id")) ;   
              
    
            Usuario usu = (Usuario) request.getAttribute("usuarioB");

             Usuario vo=new Usuario();
             UsuarioDAO da = new UsuarioDAO();
             
                vo.setSenha(Senha);
                vo.setLogin(Login);
                vo.setId(Id);
                vo.setNome(Nome);
                da.alterar(vo);
                
          List<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios = da.Lista();
        request.setAttribute("xuxa", usuarios);
		
        RequestDispatcher dispatcher=request.getRequestDispatcher("inicial.jsp");
        dispatcher.forward(request, response);
        

        
        %>
        
    </body>
</html>
