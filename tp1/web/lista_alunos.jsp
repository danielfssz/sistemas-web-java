<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.AlunoVO"%>
<%@page import="com.ifsp.edu.model.AlunoVO"%>
<jsp:include page="/menu.jsp"/>
<br>
<br>

<div class="container">
   <% List<AlunoVO> listaAlunos = (List<AlunoVO>) request.getAttribute("listaAlunos"); %>
    <% for (AlunoVO aluno : listaAlunos) {%>
    <ul>
        <li><%= aluno.getNome()%></li>
    </ul>

    <% }%>

</div>
<jsp:include page="/footer.jsp"/>