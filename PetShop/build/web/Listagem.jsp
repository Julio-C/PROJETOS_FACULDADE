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
  <title>LISTAGEM DE CLIENTE</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<center>
<form name="form1" method="post" action="index.jsp">
<div class="container">
<h1><strong>CLIENTES CADASTRADOS</strong></h1>
<br>
<table class="table the-bordered">
    <thead>
        <th>CODIGO</th>
        <th>NOME</th>
        <th>ENDEREÇO</th>
        <th>NUMERO</th>
        <th>CPF</th>
        <th>DATA DE NASCIMENTO</th>
        <th>DDD</th>
        <th>TELEFONE</th>
        <!--th>DELETAR</th!-->
        <!--th>ALTERAR</th!-->
    </thead>
<tbody>
     
<% 
List<TabelaClienteBean> clientes = HibernateAulaDAO.listar(TabelaClienteBean.class);
List<TabelaTelefoneBean> telefones = HibernateAulaDAO.listar(TabelaTelefoneBean.class);

for (int i = 0; i < clientes.size(); i++) 
{
    TabelaClienteBean cliente = (TabelaClienteBean) clientes.get(i);
    TabelaTelefoneBean telefone = (TabelaTelefoneBean) telefones.get(i);
%>        
<tr>
    <td> <%= cliente.getCod() %></td> 
    <td><%= cliente.getNome() %></td>
    <td><%= cliente.getEndereço() %></td> 
    <td><%= cliente.getNumero()%></td>
    <td><%= cliente.getCpf() %></td>
    <td><%=cliente.getDatanascimento() %></td>
    <td><%=telefone.getDdd() %></td>      
    <td><%=telefone.getTelefone() %></td>      
    <!--td><a href=ClienteServlet?action=Deletar&cod=<%= cliente.getCod() %>><i style="font-size:24px;color:red" class="fa">&#xf014;</i></a></td!-->
    <!--td><a href=ClienteServlet?action=Alterar&cod=<%= cliente.getCod() %>><i class="fa fa-pencil-square-o" style="font-size:24px;color:blue"></i></a></td!-->
</tr>
    <%
}   
%>
    </tbody>
  </table>
</div>
</body>
<p><button><a href="ClienteServlet?action=retorno" type="button" border-radius:15px>Retornar</a></button></p>
</form>
</center>
</body>
</html>
