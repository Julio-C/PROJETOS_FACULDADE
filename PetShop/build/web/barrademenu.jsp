<%@page import="java.util.ArrayList"%>
<jsp:useBean id="login" class="com.bean.TabelaUsuarioBean" scope="session"/>
<%@page import="com.bean.TabelaUsuarioBean"%>
<%-- 
    Document   : barrademenu
    Created on : 13/04/2019, 23:10:55
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
    <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/sign-in/">

    <!-- Bootstrap core CSS -->
    <link href="/docs/4.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> 
  </head>

  <body>

    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="#">Pet Shop</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      
      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
                 
            <li>
                <a class="nav-link" href="Gatos.jsp">GATOS<span class="sr-only"></span></a>
          </li>
          <li>
              <div>
                <a class="nav-link" href="Caes.jsp">CAES<span class="sr-only"></span></a>
            </div>
          </li>

          <li>
            <div>
                <a class="nav-link" href="Promocao.jsp">Promoções<span class="sr-only"></span></a>
            </div>
          </li>
          <!--li>
              <a class="nav-link" href="CarrinhoCompra.jsp">Carrinho<span class="sr-only"></span></a>
          </li!-->
        </ul>
        <form class="form-inline my-1 my-lg-0">
          <p><a><% String Login = (String)session.getAttribute("usuario");
                if(Login != null)
                {%><a class="nav-link" href="" ><%=Login%><span class="sr-only">(atual)</span></a><p><a href="CarrinhoCompra.jsp"> <img src="Photo/carrinho_pet.jpg" width="35" height="35" ></a></p><%}
                else
                {%><a class="nav-link" href="PaginaLogin.jsp">Realize seu Login<span class="sr-only">(atual)</span></a><%}
                %></p>
          <!--a class="nav-link" href="Login.jsp">Login<span class="sr-only">(atual)</span></a!-->
        </form>
      </div>
    </nav>
    </body>
</html>
