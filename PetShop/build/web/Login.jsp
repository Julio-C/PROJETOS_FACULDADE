<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Tela de Login</title>
                 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.5">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/sign-in/">

    <!-- Bootstrap core CSS -->
    <link href="/docs/4.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


            <link href="css/petshop.css" rel="stylesheet" type="text/css"/>
            <style type="text/css">@import url("css/petshop.css"); </style>
	</head>
	<body  class=login-page>           
            <center>
            <h1>Login</h1>
        
	<form name ='frmLogin' method = 'POST' action='LoginServlet'>
            <div> 
                <input type="text" id="inputEmail" class="form-control" placeholder="petshop@exemplo.com" required="" autofocus="" name = 'usuario'>
            </div>
            <div>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="" name = 'senha'>
            </div>		
            <div class ="top">
                <button class="css3button" type="submit">Sign in</button>
            </div>
	</form>
            <br>
            </center>
            <div>
             <center>  <a class="nav-link" href="CadastroCliente.jsp">Ainda não tem um cadastro<span class="sr-only"></span></a></center>               
          </div>
        <br>
           <div>
             <center>  <a class="nav-link" href="CadastroClienteAlterar.jsp">Alterar Cadastro<span class="sr-only"></span></a></center>               
          </div>
	</body>
</html>