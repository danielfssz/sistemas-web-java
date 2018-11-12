<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Alterar Cadastro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <jsp:useBean id="usuarioB" scope="request" class="com.ifsp.edu.model.Usuario"/>
      
  
        
        <form id="frmLogin" action="alteracao.jsp" method="post" >
        <h1>Login</h1>
        <table>
        <tr>
        	<td>Id</td>
                <td><input id="usu_id" name="id" type="text" value="<jsp:getProperty name="usuarioB" property="id"/>"> </td>
         </tr>            
        <tr>
        	<td>Login:</td>
                <td><input id="login_id" name="login" type="text" value="<jsp:getProperty  name="usuarioB" property="login"/>"> </td>
         </tr>
         <tr>
         	<td>Senha: </td>
         	<td><input id="senha_id" name="senha" type="password" value="<jsp:getProperty name="usuarioB" property="senha"/>"></td>         
         </tr>
         <tr>
         	<td>Nome:</td>
         	<td><input id="nome_id" name="nome" type="text" value="<jsp:getProperty  name="usuarioB" property="nome"/>"></td>         
         </tr>         
         <tr>
         	<td></td>
         	<td align="right" > <input id="enviar" type="submit" value="Gravar"></td>
         </tr>
       
       
        </table>
      
        </form>
    </body>
</html>
