<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Tela de Login</h2>
  <p>Informar usuario e senha para acessar , caso não tenha seu cadastro click no link para cadastrar-se</p>
  <form class="form-inline" action="LoginServlet">
    <div class="form-group">
      <label class="sr-only" for="email">Email:</label>
      <input type="text" class="form-control" id="email" placeholder="Usuario"  name="usuario">
    </div>
    <div class="form-group">
      <label class="sr-only" for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Senha" name="senha">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
  <br>
    <div>
    <a class="nav-link" href="CadastroCliente.jsp">Ainda não tem um cadastro<span class="sr-only"></span></a></center>               
    </div>
  <br>
    <div>
    <a class="nav-link" href="CadastroClienteAlterar.jsp">Alterar Cadastro<span class="sr-only"></span></a></center>               
    </div>
  <br>
      <div>
    <a class="nav-link" href="index.jsp">Voltar<span class="sr-only"></span></a></center>               
    </div>
</div>

</body>
</html>