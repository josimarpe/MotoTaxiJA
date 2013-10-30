<%-- 
    Document   : listaMotoTaxista
    Created on : 29/10/2013, 03:46:10
    Author     : josimarpc
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="br.edu.novaroma.model.MotoTaxista"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mototaxistas Cadastrados</title>
    </head>
    <body>
        <h1>Mototaxistas Cadastrados</h1>
        <table border="1" cellspacing="3" cellpadding="3" >
            <tr>
                <th>#</th>
                <th>nome</th>
                <th>nascimento</th>
                <th>telefone</th>
                <th>cpf</th>
                <th>email</th>
                <th>login</th>
                <th>senha</th>
                <th>validadeCnh</th>
                <th>categoriaCnh</th>
                <th>rua</th>
                <th>numero</th>
                <th>bairro</th>
                <th>cidade</th>
                <th>cep</th>
            </tr>
            
            <%
                List<MotoTaxista> lista = (List<MotoTaxista>)request.getAttribute("lista");
                DateFormat df = new SimpleDateFormat();
                NumberFormat nf = NumberFormat.getCurrencyInstance();
                int num = 1;
                
                for (MotoTaxista mototaxista : lista){
                    %>
            
                    <tr>
                        <td><%=num++%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        <td><%=%></td>
                        
                        <% } %>
                        
                    </tr>
                    
        </table>
                        <p><hr /><p><a href="index.jsp">Cadastro de Mototaxista</a></p>
    </body>
</html>
