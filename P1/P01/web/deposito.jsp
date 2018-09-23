<%-- 
    Document   : deposito
    Created on : 22/09/2018, 11:32:24
    Author     : Elienai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/menu.jsp"/>   
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposito</title>
    </head>
    <body>
        <form id="frmDeposito"  method="get" action="depositarSaldo" >
            <table>

                 <tr>
                     <td>Id Cliente</td>
                     <td> <input type="text" name="id_cliente" id="cliente">  </td>
                 </tr>

                 <tr>
                     <td>Valor</td>
                     <td> <input type="text" name="vl_deposito" id="id_vl_deposito">  </td>             
                 </tr>

                 <tr>
                     <td>Data Operacao</td>
                     <td> <input type="date" name="dt_deposito" id="id_dt_deposito">  </td>            
                 </tr>

                 <tr>
                     <td colspan="2"> <input type="submit" value="Gravar"> </td>
                 </tr>
             </table>
        </form>
<jsp:include page="/footer.jsp"/>
