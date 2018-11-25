<%-- 
    Document   : cadastro_cliente
    Created on : 25/08/2018, 15:58:55
    Author     : aluno
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/menu.jsp"/>   

       
    <form id="frmCadCliente"  method="post" action="inserirVeiculo" >
        <table>
            
            <tr>
                <td>Modelo</td>
                <td> <input type="text" name="modelo" id="modelo">  </td>
            </tr>
            
            <tr>
                <td>Placa</td>
                <td> <input type="text" name="placa" id="placa">  </td>             
            </tr>

            <tr>
                <td>Cor</td>
                <td> <input type="text" name="cor" id="cor">  </td>            
            </tr>
            
            <tr>
                <td>Ano</td>
                <td> <input type="text" name="ano" id="ano">  </td>              
            </tr>
           
            <tr>
                <td colspan="2"> <input type="submit" value="Gravar"> </td>
            </tr>
        </table>
    </form>
<jsp:include page="/footer.jsp"/>