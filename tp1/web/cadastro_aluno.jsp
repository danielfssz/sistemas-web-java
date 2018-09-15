<jsp:include page="/menu.jsp"/>
<br>
<br>

<div class="container">
    <form method="post" action="cadastro_aluno">
        <div class="form-group">
            <label>Nome</label>
            <input type="text" class="form-control" id="nome" name="nome" placeholder="Digite o nome">
        </div>
        <div class="form-group">
            <label>Endereco</label>
            <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Digite o endereco">
        </div>
        <div class="form-group">
            <label>Data de Nascimento</label>
            <input type="date" class="form-control" id="dt-nasc" name="dt_nasc" placeholder="Digite a data de nascimento">
        </div>
        <div class="form-group">
            <label>Email</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="Digite o email">
        </div>
        <div class="form-group">
            <label>Numero da Matricula</label>
            <input type="text" class="form-control" id="matricula" name="matricula" placeholder="Digite a matricula">
        </div>
        <div class="form-group">
            <label>CPF</label>
            <input type="text" class="form-control" id="cpf" name="cpf" placeholder="Digite o email">
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
<jsp:include page="/footer.jsp"/>