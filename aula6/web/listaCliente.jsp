<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.Cliente"%>

<jsp:include page="/menu.jsp"/>     

<div class="container">

    <% List<Cliente> listaCliente = (List<Cliente>) request.getAttribute("listaCliente"); %>
    <% for (Cliente cliente : listaCliente) {%>
    <ul>
        <li><%= cliente.getNome()%></li>
    </ul>

    <% }%>

</div>
<jsp:include page="/footer.jsp"/>