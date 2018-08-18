<%-- 
    Document   : result
    Created on : 11/08/2018, 15:06:38
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <% String calculo = request.getAttribute("calculo").toString(); %>
        <h1>Resultado da <%=calculo%></h1>
        
        <% String resultado = request.getAttribute("resultado").toString(); %>
        <h3><%=resultado%></h3>
        
        
        <h5><a href="calculo.jsp">Calculadora</a></h5>
    </body>
</html>
