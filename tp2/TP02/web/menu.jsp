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

        <%--
        <%
	String usuario=(String) session.getAttribute("usuario");
	if (usuario==null){
		response.sendRedirect("login.html");
	}else{
		out.print("Bem vindo, " + usuario + "</br>");
	}
        %>
        
        
        <c:choose>
 <c:when test="${empty usuario}">
     <c:redirect url="index.html"/>
 </c:when>
 <c:when test="${usuario eq "elienai"}">
     <c:redirect url="index.html"/>
 </c:when>
 <c:otherwise>
     Bem vindo, + ${usuario}
 </c:otherwise>
</c:choose>
    

        
        
        --%>
        
    <%--       
    <c:if test="${empty usuario}">
        <c:redirect url="index.html"/>        
    </c:if>
    
    <c:if test="${!empty usuario}">
        Bem vindo ${usuario}       
    </c:if>    
    --%>
    
        <%-- 
  <c:choose>
    <c:when test="${empty usuario}"> <c:redirect url="index.html"/>  </c:when>
    <c:otherwise>Bem vindo, + ${usuario} </c:otherwise>
  </c:choose>
    
    --%>

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
<li> <a href="cadastro.jsp">Usuario</a></li>
<li> <a href="#">Produto</a></li>
<li> <a href="cadastro_cliente1.jsp">Cliente</a></li>
<li> <a href="fimSessao">Sair</a></li>
</ul>
</nav>
	

