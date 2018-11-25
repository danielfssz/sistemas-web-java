<%-- 
    Document   : veiculo_lista
    Created on : 08/12/2018, 11:07:55
    Author     : Elienai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/menu.jsp"/>

<style type="text/css">
table#alter td {background:#FFFFCC;}
table#alter tr.dif td {background:#EEEEEE;}
</style>

<%--
    <jsp:useBean id="usuario" scope="request" class="com.ifsp.edu.model.Usuario"/>
--%>

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
                </tr>
                <%-- 
                <c:forEach  items="${xuxa}" var="usuario">
                    <tr>

                            <td>${usuario.id}</td>
                            <td>${usuario.nome}</td>
                            <td>${usuario.login}</td>
                            <td>${usuario.senha}</td>  
                            <td> <a href="alterarUsuario?login=${usuario.login}&nome=${usuario.nome}
                                    &senha=${usuario.senha}&id=${usuario.id}">Editar</a> 
                            </td>                        

                     </tr>
                  </c:forEach>
                --%>
          
        </table>
  
<jsp:include page="/footer.jsp"/>
