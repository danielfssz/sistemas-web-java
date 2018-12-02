<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.Cliente"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="/menu.jsp"/>

<style type="text/css">
    table#alter td {background:#FFFFCC;}
    table#alter tr.dif td {background:#EEEEEE;}
</style>


<jsp:useBean id="cliente" scope="request" class="com.ifsp.edu.model.Cliente"/>

<form id="alterarCliente" action="alterarCliente" method="post">
    <h4>Nome</h4>
    <input type="text" id="nome" name="nome" value="${cliente.nome}">
    <br>
    <br>
    <h4>Endereco</h4>
    <input type="text" id="endereco" name="endereco" value="${cliente.endereco}">
    <br>
    <br>
    <h4>CEP</h4>
    <input type="text" id="cep" name="cep" value="${cliente.CEP}">
    <br>
    <br>
    <h4>Email</h4>
    <input type="text" id="email" name="email" value="${cliente.email}">
    <br>
    <br>
    <h4>Telefone</h4>
    <input type="text" id="telefone" name="telefone" value="${cliente.email}">
    <br>
    <br>
    <h4>Estado</h4>
    <input type="text" id="telefone" name="estado" value="${cliente.estado}">
    <input type="submit" value="Salvar">
</form>



<jsp:include page="/footer.jsp"/>