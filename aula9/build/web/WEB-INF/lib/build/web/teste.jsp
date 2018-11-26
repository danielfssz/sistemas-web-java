<%-- 
    Document   : teste
    Created on : 20/10/2018, 09:45:29
    Author     : Elienai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="frmTeste" action="frmLogin.jsp">
            <table >
                <thead>
                    <tr>
                        <th>Coluna1</th>
                        <th>Coluna2</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="nome" value="" /></td>
                    </tr>
                    <tr>
                        <td>Endereco:</td>
                        <td><input type="text" name="endereco" value="" /></td>
                    </tr>
                    <tr>
                        <td>Cep:</td>
                        <td><input type="text" name="cep" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Enviar" name="btnEnviar" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
