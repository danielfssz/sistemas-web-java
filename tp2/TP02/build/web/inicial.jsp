<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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


<%--   
    <%
	List<Usuario> usuarios =(List<Usuario>) request.getAttribute("xuxa");
      
    %>
--%>

<jsp:useBean id="usuario" scope="request" class="com.ifsp.edu.model.Usuario"/>
        
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
                
                <c:forEach  items="${listaCliente}" var="cliente">
                    <tr>

                            <td>${usuario.id}</td>
                            <td>${usuario.nome}</td>
                            <td>${usuario.login}</td>
                            <td>${usuario.senha}</td>  
                            <td> <a href="alterarUsuario?login=${usuario.login}&nome=${usuario.nome}
                                    &senha=${usuario.senha}&id=${usuario.id}">Editar</a> 
                            </td>                        

                     </tr>
                  </c:forEach>
          
        </table>
  
<jsp:include page="/footer.jsp"/>