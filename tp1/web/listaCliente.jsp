<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.Cliente"%>

<jsp:include page="/menu.jsp"/>     

<div class="container">

    <% List<Cliente> listaCliente = (List<Cliente>) request.getAttribute("listaCliente"); %>
    <% for (Cliente cliente : listaCliente) {%>
    <ul>
        <li>Nome: <%= cliente.getNome()%></li>
        <li>Email:<%= cliente.getEmail() %></li>
        <li>CEP: <%= cliente.getCep()%></li>
        <li>Endereço: <%= cliente.getEndereco()%></li>
        <li>Telefone: <%= cliente.getTelefone()%></li>
    </ul>

    <% }%>

</div>
<jsp:include page="/footer.jsp"/>