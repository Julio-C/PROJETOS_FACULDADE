<%-- 
    Document   : TelaAdministrador
    Created on : 11/05/2019, 11:34:04
    Author     : marco.junior
--%>
<jsp:include page="/barrademenu.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menu Principal</h1>
        <br>
        <!--p><a href="ClienteServlet?action=retorno">Listar Produtos</a></p!-->
        <!--p><a href="ClienteServlet?action=ListarCliente">Listar Clientes</a></p!-->
    
          <div class="container">
        <!-- Exemplo de linha de colunas -->
        <div class="row">
          <div class="col-md-4">
            <h2>Clientes</h2>
            <p>Listagem de todos os clientes cadastrados em seu site </p>
            <p><a class="btn btn-secondary" href="ClienteServlet?action=ListarCliente" role="button">Listar Clientes »</a></p>
          </div>
          <div class="col-md-4">
            <h2>Produtos</h2>
            <p>Listagem de todos os Produtos cadastrados em seu site</p>
            <p><a class="btn btn-secondary" href="ProdutoServlet?action=ListarProdutos" role="button">Listar Produtos »</a></p>
            <p>Inserir produtos</p>
            <p><a class="btn btn-secondary" href="ProdutoServlet?action=inserir" role="button">Inserir Produtos »</a></p>
          </div>
          <div class="col-md-4">
            <h2>Listar Pets</h2>
            <p>Listagem de todos os Pets cadastrados em seu site</p>
            <p><a class="btn btn-secondary" href="PetServlet?action=ListarPet" role="button">Listar Pets »</a></p>
          </div>
         <div class="col-md-4">
            <h2>Promoção</h2>
            <p>Inserir produto na tela de Promoção </p>
            <p><a class="btn btn-secondary" href="ProdutoServlet?action=ListarProdutosPromocao" role="button">Inserir Promoção »</a></p>
        </div>
           <div class="col-md-4">
            <h2>Retonar</h2>
            <p>Deslogar usuário administrado</p>
            <p><a class="btn btn-secondary" href="index.jsp" role="button">Voltar »</a></p>
        </div>
        <hr>

      </div> <!-- /container -->
    </body>
</html>
