<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.Cliente"%>
<%@page import="com.ifsp.edu.model.Estado"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="/menu.jsp"/>

<style type="text/css">
    table#alter td {background:#FFFFCC;}
    table#alter tr.dif td {background:#EEEEEE;}
</style>


<jsp:useBean id="usuario" scope="request" class="com.ifsp.edu.model.Cliente"/>
<jsp:useBean id="estado" scope="request" class="com.ifsp.edu.model.Estado"/>

<br>
<br>
<br>

<table border="1px" cellpadding="5px" cellspacing="0" id="alter" align="center">
    <tr>
        <td>Id</td>
        <td>Nome</td>
        <td>Endereco</td>
        <td>CEP</td>
        <td>Email</td>
        <td>Telefone</td>
        <td>Estado</td>
    </tr>

    <c:forEach  items="${listaCliente}" var="cliente">
        <tr>

            <td>${cliente.id}</td>
            <td>${cliente.nome}</td>
            <td>${cliente.endereco}</td>
            <td>${cliente.CEP}</td>
            <td>${cliente.email}</td>
            <td>${cliente.telefone}</td>
            <td>${cliente.estado.sigla}</td>

            <%--
            <td> <a href="alterarUsuario?login=${usuario.login}&nome=${usuario.nome}
                    &senha=${usuario.senha}&id=${usuario.id}">Editar</a> 
            </td> --%>

        </tr>
    </c:forEach>

</table>

<jsp:include page="/footer.jsp"/>