<%@page import="java.util.List"%>
<%@page import="com.ifsp.edu.model.AlunoVO"%>
<jsp:include page="/menu.jsp"/>
<br>
<br>

<div class="container">
    <% List<AlunoVO> listaAlunos = (List<AlunoVO>) request.getAttribute("listaAlunos"); %>

    <% for (AlunoVO aluno : listaAlunos) {%>
    <ul>       
        <li>Nome: <%= aluno.getNome()%></li>
        <li>Email:<%= aluno.getEmail()%></li>
        <li>Data de Nascimento: <%= aluno.getDt_nascimento()%></li>
        <li>Endereço: <%= aluno.getEndereco()%></li>
        <li>Matricula: <%= aluno.getMatricula()%></li>
        <form method="post" action="deletarAluno">
            <input type="hidden" name="cpf" id="cpf" class="form-control" value="<%= aluno.getCpf()%>">
            <button type="submit" class="btn btn-outline-danger btn-sm">Apagar</button>
        </form>
        <form method="get" action="alterarAluno">
            <input type="hidden" name="cpf" id="cpf" class="form-control" value="<%= aluno.getCpf()%>">
            <button type="submit" class="btn btn-outline-warning btn-sm">Alterar</button>
        </form>
    </ul>

    <% }%>
</div>

<jsp:include page="/footer.jsp"/>