-
<%-- 
    Document   : menu
    Created on : Aug 25, 2018, 11:14:05 AM
    Author     : Elienai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

<style>
#menu ul {
width: 100%;
height: auto;
padding: 10px;
margin: 0;
background-color: #069;
list-style: none; 
/* remove os pontinhos antes dos itens */
}
#menu ul li {
display: inline; 
/* alinha os itens na horizontal */
}
#menu ul li a {
padding: 2px 10px;
display: inline-block;
margin-left: 15px;
background-color: #069;
color: #fff;
text-decoration: none; 
/* remove o sublinhado do link */

border-bottom: 3px solid #069;
}
#menu ul li a:hover { 
/* efeito para quando passar o mouse 
   sobre o item do menu */
color: #f5f5f5;
border-bottom: 3px solid #f5f5f5;
}
</style>

<nav id="menu">
<ul>
<li> <a href="veiculo_cadastro.jsp">Cadastro</a></li>
<li> <a href="veiculo_lista.jsp">Relatorios</a></li>
<li> <a href="#">Sair</a></li>
</ul>
</nav>
	

