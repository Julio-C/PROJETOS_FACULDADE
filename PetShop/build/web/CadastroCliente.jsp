<%-- 
    Document   : CadastroCliente
    Created on : 26/04/2019, 12:39:01
    Author     : marco.junior
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Cadastro de Cliente</title>
  <meta charset="UTF-8">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>                  
    <div id="cliente" class="tab-pane container active">
    <center> <h1>Cadastro de Cliente</h1> </center>
    <form name="frmIncluir" action="ClienteServlet" method="GET">
    <div id="cliente" class="tab-pane container active">  
     <table border="1">
         <div class="row">
		<div class="col-md-6 mb-3">
                    Nome:
                    <input type="text" class="form-control" id="firstName" placeholder="" value="" required=""name="nome">
                </div>
              <div class="col-md-3 mb-3">
                    Genero:
                    <select type="text" class="form-control" id="firstName" placeholder="" value="" required=""name="genero">
                        <option value="Masculino">Masculino</option>
                        <option value="Feminino">Feminino</option>
                    </select>
                </div>
         </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        Endereço:
                        <input type="text" class="form-control" id="endereco" placeholder="" value="" required="" name="endereco">
                    </div>
                    <div class="col-md-3 mb-3">
                    Nº:
                    <input type="text" class="form-control" id="numero" placeholder="" value="" required="" name="numero">
                    </div>
                </div>        
                 <div class="row">
                    <div class="col-md-3 mb-3">
                        CPF:
                        <input type="text" class="form-control" id="cpf" placeholder="" value="" required="" name="cpf">
                    </div>
                    <div class="col-md-3 mb-3">
                    RG:
                    <input type="text" class="form-control" id="rg" placeholder="" value="" required="" name="rg">
                    </div>
                     <div class="col-md-3 mb-3">
                    Data de Nascimento
                    <input type="text" class="form-control" id="dataDeNascimento" placeholder="" value="" required="" name="dataDeNascimento">
                     </div>
                </div>   
                <div class="row">
		<div class="col-md-3 mb-3">
                    Email
                    <input type="email" class="form-control" id="email" placeholder="" value="" required=""name="email">
                </div>  
                 <div class="col-md-3 mb-3">
                    Senha
                    <input type="text" class="form-control" id="senha" placeholder="" value="" required=""name="senha">
                </div>
                <div class="col-md-1 mb-3">
                    DDD
                    <input type="text" class="form-control" id="ddd" placeholder="" value="" required="" name="ddd">
               </div>
                <div class="col-md-2 mb-3">
                    Telefone
                    <input type="text" class="form-control" id="telefone" placeholder="" value="" required="" name="telefone">
                </div>               
         </div>       
         <center> <h1>Cadastro do PET</h1> </center>
            <div class="row">
		<div class="col-md-3 mb-3">
                    Nome do Pet
                    <input type="text" class="form-control" id="nome_pet" placeholder="" value="" required=""name="nome_pet">
                </div>
                 <div class="col-md-2 mb-3">
                     Raça :
                    <select type="text" class="form-control" id="raca_pet" placeholder="" value="" required=""name="raca_pet">
                        <option value="raca_1">1</option>
                        <option value="raca_2">2</option>
                    </select>
                </div>
                <div class="col-md-2 mb-3">
                    Peso :
                    <input type="text" class="form-control" id="peso_pet" placeholder="" value="" required="" name="peso_pet">
               </div>
                <div class="col-md-2 mb-3">
                    Data de Nascimento
                    <input type="text" class="form-control" id="dataDeNascimento_pet" placeholder="" value="" required="" name="dataDeNascimento_pet">
                </div>               
            </div>       
    </table>
    <div class="container">
        <div class="row">
            <br><br>
            <div class="col-md-3 mb-3">
            <button class="btn btn-primary btn-lg" type="submit" id="t1">Inserir Cadastro</button>
            </div>
            <div class ="col-md-3 mb-3">
            <button class="btn btn-primary btn-lg" type="reset">Limpar Dados</button>
           </div>
           <div class ="col-md-3 mb-3">
           <p> <a class="btn btn-primary btn-lg" href="ClienteServlet?action=index">Retornar</a></p>
           </div>            
          </div>
    </div>
    </div>             
</form>
</div>
        
</body>   
</html>
