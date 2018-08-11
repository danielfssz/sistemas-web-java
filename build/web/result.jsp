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
        <h1>Resultado da <% out.println(request.getAttribute("calculo")); %></h1>
        <h3><% request.getAttribute("resultado").toString(); %></h3>
    </body>
</html>
