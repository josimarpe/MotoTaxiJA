<%-- 
    Document   : index
    Created on : 29/10/2013, 00:37:11
    Author     : josimarpc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Mototaxista</title>
    </head>
    <body>
        <h1>Cadastro de Mototaxista</h1>
        <form action ="CadastrarMotoTaxista" name="cadastro" method="post">
            <p>Nome: <input type="text" name="nome" size="30" /></p>
            <p>Data de Nascimento: <input type="text" name="nascimento" size="15" />(dd/mm/yyyy)</p>
            <p>Telefone: <input type="text" name="telefone" size="15" /></p>
            <p>CPF: <input type="text" name="cpf" size="15" /></p>
            <p>Email: <input type="text" name="email" size="30" /></p>
            <p>Login: <input type="text" name="login" size="30" /></p>
            <p>Senha: <input type="text" name="senha" size="15" /></p>
            <p>Validade Cnh <input type="text" name="validadeCnh" size="30" /></p>
            <p>Categoria Cnh<input type="text" name="categoriaCnh" size="10" /></p>
            <h1>Dados do Endereço</h1>
            <p>Rua: <input type="text" name="rua" size="30" /></p>
            <p>Numero: <input type="text" name="numero" size="10" /></p>
            <p>Bairro <input type="text" name="bairro" size="30" /></p>
            <p>Cidade: <input type="text" name="cidade" size="30" /></p>
            <p>Cep: <input type="text" name="cep" size="10" /></p>
            <input type="submit" value="Cadastrar" /> <input type="submit" value="Cancelar" />
            </form>
</html>
