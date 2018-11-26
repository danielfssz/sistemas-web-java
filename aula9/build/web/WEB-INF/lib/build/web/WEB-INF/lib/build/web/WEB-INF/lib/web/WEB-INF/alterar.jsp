<!DOCTYPE html>
<jsp:include page="/menu.jsp"/>     
        
        <% 
            String Login =request.getParameter("login");
            String Senha =request.getParameter("senha");
            String Nome =request.getParameter("nome");
            int Id =Integer.parseInt(request.getParameter("id")) ;        
        %>
        
        <form id="frmLogin" action="alteracao.jsp" method="post" >
        <h1>Login</h1>
        <table>
        <tr>
        	<td>Id</td>
                <td><input id="usu_id" name="id" type="text" value=<%= String.valueOf(Id) %>> </td>
         </tr>            
        <tr>
        	<td>Login:</td>
                <td><input id="login_id" name="login" type="text" value=<%= Login %>> </td>
         </tr>
         <tr>
         	<td>Senha: </td>
         	<td><input id="senha_id" name="senha" type="password" value=<%= Senha %>></td>         
         </tr>
         <tr>
         	<td>Nome:</td>
         	<td><input id="nome_id" name="nome" type="text" value=<%= Nome %>></td>         
         </tr>         
         <tr>
         	<td></td>
         	<td align="right" > <input id="enviar" type="submit" value="Gravar"></td>
         </tr>
       
       
        </table>
        
        </form>
                
<jsp:include page="/footer.jsp"/>