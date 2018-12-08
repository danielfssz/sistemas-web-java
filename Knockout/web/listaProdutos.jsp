<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.ProdutoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Produtos</title>
        <style>
            .contain a {
                margin-left: 700px;             
            }
        </style>
    </head>
    <body>
        <h1>Lista de Produtos</h1>
        <div class="contain">
            <table border="1px" cellpadding="5px" cellspacing="0" id="alter" align="center">
                <tr>
                    <td>Id</td>
                    <td>Codigo</td>
                    <td>Descricao</td>
                    <td>Valor</td>                
                </tr>
                <c:forEach  items="${listaProduto}" var="produto">
                    <tr>
                        <td>${produto.id}</td>
                        <td>${produto.codigo}</td>
                        <td>${produto.descricao}</td>
                        <td>${produto.valor}</td>  
                    </tr>
                </c:forEach>
            </table>
            <br>
            <br>
            <br>
            <a href="./">
                <button type="button">Home</button>
            </a>
        </div>
    </body>
</html>
