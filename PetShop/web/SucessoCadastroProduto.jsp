<%-- 
    Document   : SucessoCadastroProduto
    Created on : 11/05/2019, 16:59:54
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
        <label>Produto : =<%= request.getParameter("nome")%> cadastrado com sucesso</label><br>
        <p><a href="ProdutoServlet?action=retorno">Retornar</a></p>
        <p><a href="ProdutoServlet?action=ListarProdutos">Listar Produtos</a></p>
    </body>
</html>
