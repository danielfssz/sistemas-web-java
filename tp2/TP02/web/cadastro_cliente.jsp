<%-- 
    Document   : cadastro_cliente
    Created on : 25/08/2018, 15:58:55
    Author     : aluno
--%>

<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.EstadoDAO"%>
<%@page import="com.ifsp.edu.model.Estado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<form id="frmCadCliente"  method="post" action="cadastroCliente" >
    <table>

        <tr>
            <td> Nome</td>
            <td> <input type="text" name="nome" id="nome">  </td>
        </tr>

        <tr>
            <td> Endereco</td>
            <td> <input type="text" name="endereco" id="endereco">  </td>             
        </tr>

        <tr>
            <td> Cep</td>
            <td> <input type="text" name="cep" id="cep">  </td>            
        </tr>

        <tr>
            <td> Email</td>
            <td> <input type="text" name="email" id="email">  </td>              
        </tr>

        <tr>
            <td> Telefone</td>
            <td> <input type="text" name="telefone" id="telefone">  </td>              
        </tr>   

        <tr>
            <td> Estado </td>
            <td>
                <select name="estado" id="estado">
                    <%  EstadoDAO dao = new EstadoDAO();
                        List<Estado> list = dao.Lista();
                        Estado est;
                        for (Object obj : list) {
                            est = (Estado) obj;
                            out.println("<option value=" + est.getSigla() + ">" + est.getDescricao().trim() + "</option>");
                        }
                    %> 
                </select>
            </td>              
        </tr>              

        <tr>
            <td colspan="2"> <input type="submit" value="Gravar"> </td>
        </tr>
    </table>
</form>
