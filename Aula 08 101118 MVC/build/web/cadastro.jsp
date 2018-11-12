<%-- 
    Document   : cadastro
    Created on : Aug 25, 2018, 11:09:30 AM
    Author     : Elienai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="/menu.jsp" />
<form id="frmLogin" action="cadastroUsuario">
    <h1>Login</h1>
    <table>
        <tr>
            <td>Login:</td>
            <td><input id="login_id" name="login" type="text"> </td>
        </tr>
        <tr>
            <td>Senha: </td>
            <td><input id="senha_id" name="senha" type="password"></td>
        </tr>
        <tr>
            <td>Nome:</td>
            <td><input id="nome_id" name="nome" type="text"></td>
        </tr>
        <tr>
            <td>
                <form id="frmVisualizarLista" method="get" action="listarInicial">
                    <input type="submit" value="Listar">
                </form>
            </td>
            <td align="right"> <input id="enviar" type="submit" value="Gravar"></td>
        </tr>


    </table>

</form>


<jsp:include page="/footer.jsp" />