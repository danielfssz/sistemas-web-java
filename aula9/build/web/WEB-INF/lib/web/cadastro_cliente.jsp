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
<jsp:include page="/menu.jsp"/>   

<%
	String usuario=(String) session.getAttribute("usuario");
        
	if (usuario==null){
		response.sendRedirect("index.html");
	}else{
		out.print("Bem vindo, " + usuario + "</br>");
	}

%>

        
    <form id="frmCadCliente"  method="get" action="cadastroCliente" >
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
                <td> Cep</td>
                <td> <input type="text" name="cep" id="cep_id">  </td>            
            </tr>
            
            <tr>
                <td> Email</td>
                <td> <input type="text" name="email" id="email_id">  </td>              
            </tr>
            
            <tr>
                <td> Telefone</td>
                <td> <input type="text" name="telefone" id="telefone_id">  </td>              
            </tr>   
            
            <tr>
                <td> Sexo </td>
                <td>
                           <select name="cbSexo">
                                <option value="M"> Masculino </option>);
                                <option value="F"> Feminino </option>);                        
                          </select>
                </td>                 
            </tr>
            
            <tr>
                <td> Estado </td>
                <td>
                           <select name="cbEstado">
                               <%  EstadoDAO dao=new EstadoDAO();
                                List<Estado> list = dao.Lista();
                                Estado est;
                                for (Object obj : list){
                                    est = (Estado)obj;
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
<jsp:include page="/footer.jsp"/>