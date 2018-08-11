<%-- 
    Document   : calculo
    Created on : 11/08/2018, 15:12:55
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        
        <form action="servletCalculo" method="POST">
            <input type="text" name="n1" autocomplete="off" placeholder="Valor numérico..."><br>
            <input type="text" name="n2" autocomplete="off" placeholder="Valor numérico..."><br>
            
            <select name="op">
                <option value="1">+</option>
                <option value="2">-</option>
                <option value="3">X</option>
                <option value="4">/</option>
            </select>
            
            <input type="submit" value="Calcular">
        </form>
    </body>
</html>
