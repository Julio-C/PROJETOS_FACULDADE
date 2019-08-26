<%-- 
    Document   : SucessoCadastroCliente
    Created on : 27/04/2019, 18:46:12
    Author     : marco.junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro realizado com sucesso</h1>
        <label>Cliente com o nome =<%= request.getParameter("nome")%> cadastrado com sucesso</label><br>
        <p><a href="ClienteServlet?action=index">Retornar</a></p>
    </body>
</html>
