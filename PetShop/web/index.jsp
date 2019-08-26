<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.TabelaProdutoBean"%>
<%@page import="Hibernate.HibernateAulaDAO"%>
<jsp:include page="/barrademenu.jsp" />
<%-- 
    Document   : index
    Created on : 07/04/2019, 11:07:41
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Mundo Cão</title>

    
  </head>

  <body>
      <main role="main">

      <!-- Principal jumbotron, para a principal mensagem de marketing ou call to action -->
      <div class="jumbotron img p1"  >
         <!--center> <img src="http://www.realepetshop.com.br/wp-content/themes/limonada/assets/img-petshop.png" width="200" height="180" /!-->
         <br>
         <center><h1 class="p1">PET SHOP - Mundo Cão</h1></center>
          <center><p><h2>O maior PetShop online da América Latina.</h2></p></center>     
      </div>
<tbody>

    <div class="container">
           <div class="row">
<% 
List<TabelaProdutoBean> produtos1 = HibernateAulaDAO.listar(TabelaProdutoBean.class);
String user = (String)session.getAttribute("usuario");

for (int i = 0; i < produtos1.size(); i++) 
{
    TabelaProdutoBean produto5 = (TabelaProdutoBean) produtos1.get(i);
%>        
<!--tr> 
    <td> <%= produto5.getNome() %></td>
    <td> <%= produto5.getCategoria() %></td> 
    <td> <%= produto5.getDescricao() %>
    <td> <%= produto5.getPeso()%></td>
    <td> <%= produto5.getPreco() %></td>
    <td> <img src="Photo/<%= produto5.getImagem1()%>.jpg" width="70" height="70" /></td>
</tr!-->
            <div class="col-sm-4">
                <h3><center><%=produto5.getCod()+"--"+produto5.getNome() %></center></h3>
                <center><p><img src="Photo/<%= produto5.getImagem1()%>.jpg" width="70" height="70" ></p></center>
                <center><p><%="R$"+produto5.getPreco() %></p></center>
                <center><p><%=produto5.getDescricao()%></p></center>
                <center><p><a 
                <% String Login = (String)session.getAttribute("usuario"); 
                if(Login !=null) {%> href="CarrinhoServlet?action=Incluir&produto=<%=produto5.getNome()%>
                &valor=<%=produto5.getPreco()%>&imagem=<%=produto5.getImagem1()%>">Adicionar ao Carrinho <%}%></a></p></center>
          </div>  
    <%
}   
%>    
          </div>
</div>
</tbody>          
    </main>
    <footer class="container">
      <p>© Companhia FMU.BR</p>
    </footer>
</body>
</html>

