<%-- 
    Document   : veiculo_lista
    Created on : 08/12/2018, 11:07:55
    Author     : Elienai
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.Veiculo"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/menu.jsp"/>

<style type="text/css">
    table#alter td {background:#FFFFCC;}
    table#alter tr.dif td {background:#EEEEEE;}
</style>


<jsp:useBean id="veiculo" scope="request" class="com.ifsp.edu.model.Veiculo"/>


<br>
<br>
<br>

<table border="1px" cellpadding="5px" cellspacing="0" id="alter" align="center">
    <tr>
        <td>Id</td>
        <td>Modelo</td>
        <td>Placa</td>
        <td>Cor</td>
        <td>Ano</td>
        <td>Alterar</td>
        <td>Excluir</td>
    </tr>

    <c:forEach  items="${listaVeiculo}" var="veiculo">
        <tr>

            <td>${veiculo.id}</td>
            <td>${veiculo.modelo}</td>
            <td>${veiculo.placa}</td>
            <td>${veiculo.cor}</td>  
            <td>${veiculo.ano}</td>  
            <td> 
                <a href="alterarVeiculo?id=${veiculo.id}">Editar</a> 
            </td>
            <td> 
                <a href="deletarVeiculo?id=${veiculo.id}">Excluir</a> 
            </td>

        </tr>
    </c:forEach>

</table>

<jsp:include page="/footer.jsp"/>
