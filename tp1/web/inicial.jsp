<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="/menu.jsp"/>

<style type="text/css">
table#alter td {background:#FFFFCC;}
table#alter tr.dif td {background:#EEEEEE;}
</style>


    
<%
	List<Usuario> usuarios =(List<Usuario>) request.getAttribute("xuxa");

       
%>
	<!--<table>
		<tr>
			<td>ID:</td>
			<td> <--%= u.getId().toString() %></td>
		</tr>
		<tr>
			<td>Nome:</td>
			<td> <--%= u.getNome() %> </td>
		</tr>
		<tr>
			<td>Login:</td> 
			<td><--%= u.getLogin() %> </td>
		</tr>
	</table> !-->

        <br>
        <br>
        <br>
 
        <table border="1px" cellpadding="5px" cellspacing="0" id="alter" align="center">
                <tr>
                        <td>Id</td>
                        <td>Nome</td>
                        <td>Login</td>
                        <td>Senha</td>
                        <td>Alterar</td>
                </tr>
                <% 
                    int linha=1;
                    for(Usuario u : usuarios){ 

                %>
                        <tr>
                                <td name="id"> <%= u.getId().toString() %></td>
                                <td name="nome"> <%= u.getNome() %> </td>
                                <td name="login"><%= u.getLogin() %> </td>
                                <td name="senha"><%= u.getSenha() %> </td>
                                <td> <a href ="alterar.jsp?login=<%= u.getLogin()%>
                                               &nome=<%= u.getNome()%>
                                               &senha=<%= u.getSenha()%>
                                               &id=<%= u.getId()%>"
                                        > Alterar  </a> </td>
                                     
                        </tr>

                <% linha+=1; }%>
        </table>
  
<jsp:include page="/footer.jsp"/>