<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.Veiculo"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/menu.jsp"/>   

<jsp:useBean id="veiculo" scope="request" class="com.ifsp.edu.model.Veiculo"/>

<form id="frmCadCliente"  method="post" action="alterarVeiculo" >
    <table>

        <tr>
            <td>Id</td>
            <td><input id="veiculo_id" name="id" type="text" value="${veiculo.id}"> </td>
        </tr>   

        <tr>
            <td>Modelo</td>
            <td> <input type="text" name="modelo" id="modelo" value="${veiculo.modelo}">  </td>
        </tr>

        <tr>
            <td>Placa</td>
            <td> <input type="text" name="placa" id="placa" value="${veiculo.placa}">  </td>             
        </tr>

        <tr>
            <td>Cor</td>
            <td> <input type="text" name="cor" id="cor" value="${veiculo.cor}">  </td>            
        </tr>

        <tr>
            <td>Ano</td>
            <td> <input type="text" name="ano" id="ano" value="${veiculo.ano}">  </td>              
        </tr>

        <tr>
            <td colspan="2"> <input type="submit" value="Gravar"> </td>
        </tr>
    </table>
</form>
<jsp:include page="/footer.jsp"/>