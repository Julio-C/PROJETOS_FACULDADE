<%@page import="com.bean.TabelaProdutoBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bean.TabelaTelefoneBean"%>
<%-- 
    Document   : Listagem
    Created on : 21/04/2019, 12:32:42
    Author     : Gonçalves
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Hibernate.HibernateAulaDAO"%>
<%@page import="com.bean.TabelaClienteBean"%>

<jsp:useBean id="ClienteLista" scope="request" class="java.util.ArrayList" />
<!DOCTYPE html>
<html lang="en">
<head>
  <title>LISTAGEM DE PRODUTOS PARA CAES</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<center>
<form name="form1" method="post" action="ProdutoServlet">
<div class="container">
<h1><strong>PRODUTOS PARA CAES</strong></h1>
<table class="table the-bordered">
    <thead>
        <th>CODIGO</th>
        <th>NOME</th>
        <th>CATEGORIA</th>
        <th>DESCRIÇÃO</th>
        <th>PESO</th>
        <th>PRECO</th>
        <th>DATA DE VENCIMENTO</th>
        <th>IMAGEM</th>
    </thead>
<tbody>
     
<% 
List<TabelaProdutoBean> produtos = HibernateAulaDAO.listar(TabelaProdutoBean.class);

for (int i = 0; i < produtos.size(); i++) 
{
    TabelaProdutoBean produto = (TabelaProdutoBean) produtos.get(i);
    String promocao = produto.getCategoria();
    if(promocao.equals("CAES"))
    {
%>        
<tr>
    <td> <%= produto.getCod() %></td> 
    <td> <%= produto.getNome() %></td>
    <td> <%= produto.getCategoria() %></td> 
    <td> <%= produto.getDescricao() %></td>
    <td> <%= produto.getPeso()%></td>
    <td> <%= produto.getPreco() %></td>
    <td> <%= produto.getDataVencimento() %></td>
    <td> <img src="Photo/<%= produto.getImagem1()%>.jpg" width="100" height="100" /></td>
</tr>

    <%
    }
}   
%>
    </tbody>
  </table>
</div>
</body>
<p><button><a href="index.jsp" type="button" border-radius:15px>Retornar</a></button></p>
</form>
</center>
</body>
</html>
