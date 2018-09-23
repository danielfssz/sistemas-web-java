<%@page import="java.util.List"%>
<%@page import="com.ifsp.prova.model.Cliente"%>

<jsp:include page="/menu.jsp"/>     

<div class="container">

    <% List<Cliente> listaCliente = (List<Cliente>) request.getAttribute("listaCliente"); %>
    <% for (Cliente cliente : listaCliente) {%>
    <ul>
        <li>Nome: <%= cliente.getNome()%></li>
        <li>Endereço:<%= cliente.getEndereco()%></li>
        <li>CPF: <%= cliente.getCpf()%></li>
        <li>Saldo: <%= cliente.getSaldo()%></li>
        <li>Descricao ultima operacao <%= cliente.getDs_ultima_operacao()%></li>
        <li>Data ultima operacao <%= cliente.getDt_ultima_operacao()%></li>
    </ul>   

    <% }%>

</div>
<jsp:include page="/footer.jsp"/>