<%-- 
    Document   : cadastro_cliente
    Created on : 25/08/2018, 15:58:55
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/menu.jsp"/>   
        
    <form id="frmCadCliente"  method="post" action="adicionarCliente" >
        <table>
            
            <tr>
                <td> Nome</td>
                <td> <input type="text" name="nome" id="nome_id">  </td>
            </tr>
            
            <tr>
                <td> Endereco</td>
                <td> <input type="text" name="endereco" id="endereco_id">  </td>             
            </tr>

            <tr>
                <td> CPF</td>
                <td> <input type="text" name="cpf" id="cpf">  </td>            
            </tr>
            
            <tr>
                <td>Saldo Inicial</td>
            <td> <input type="text" name="vl_saldo" id="id_vl_saldo">  </td>              
            </tr>

            <tr>
                <td colspan="2"> <input type="submit" value="Gravar"> </td>
            </tr>
        </table>
    </form>
<jsp:include page="/footer.jsp"/>