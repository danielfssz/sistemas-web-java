<%-- 
    Document   : saque
    Created on : 22/09/2018, 11:32:44
    Author     : Elienai
--%>

    <jsp:include page="/menu.jsp"/>     


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form id="frmSaque"  method="get" action="controleSaque" >
            <table>

                 <tr>
                     <td>Id Cliente</td>
                     <td> <input type="text" name="id_cliente" id="cliente">  </td>
                 </tr>

                 <tr>
                     <td>Valor</td>
                     <td> <input type="text" name="vl_saque" id="id_vl_saque">  </td>             
                 </tr>

                 <tr>
                     <td>Data Operacao</td>
                     <td> <input type="text" name="dt_saque" id="id_dt_saque">  </td>            
                 </tr>

                 <tr>
                     <td colspan="2"> <input type="submit" value="Gravar"> </td>
                 </tr>
             </table>
        </form>
    </body>
</html>
<jsp:include page="/footer.jsp"/>