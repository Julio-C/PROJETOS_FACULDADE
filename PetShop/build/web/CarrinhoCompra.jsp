<%-- 
    Document   : Carrinho
    Created on : 15/05/2019, 22:56:16
    Author     : julio
--%>
<%@page import="com.util.Calculadora"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <%
        ArrayList lista = new ArrayList();
        lista = (ArrayList) session.getAttribute("lista");
 	int valores = 0;
        for(int a = 0 ; a < lista.size();a++){
    String produtosComprados = lista.get(a).toString();
if(produtosComprados.startsWith("&"))
{
    String[] variavel = produtosComprados.split("&");
    
    valores =valores + Calculadora.Conversor(variavel[2]);


%><p><%=variavel[0]%></p>
<label>Nome do Produto=<%=variavel[1]%> Valor do Produto=<%=variavel[2]%><img src="Photo/<%=variavel[3]%>.jpg"width="70" height="70"></label>
        
        <br>
<%        
} 	
}%>
<label>Total gasto em Reais<%=valores%></label>
    </body>
</html>