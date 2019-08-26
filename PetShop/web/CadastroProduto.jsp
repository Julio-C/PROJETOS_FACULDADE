<jsp:include page="/barrademenu.jsp" />
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
        
        <title>Cadastro de Produtos</title>
        <meta charset="UTF-8">
    </head>
    <body>                  
    <div id="cliente" class="tab-pane container active"><br><br><br><br> 
    <center> <h1>Cadastro de Produtos</h1> </center>
    <form name="frmIncluir" action="ProdutoServlet" method="GET">
    <div id="cliente" class="tab-pane container active">  
     <table border="1">
         <div class="row">
              <div class="col-md-6 mb-3">
               Nome:
                <input type="text" class="form-control" id="firstName" placeholder="" value="" required=""name="nome">
              </div>
              <div class="col-md-3 mb-3">
                    Categoria :
                 <select type="text" class="form-control" id="firstName" placeholder="" value="" required=""name="categoria">
                    <option value="CAES">CAES</option>
                    <option value="GATOS">GATOS</option>
                  </select>
                </div>
         </div>
                <div class="row">
                    <div class="col-md-9 mb-3">
                    Descrição :
                    <input type="text" class="form-control" id="endereco" placeholder="" value="" required="" name="descricao">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 mb-3">
                    Descrição Imagem 1 :
                    <input type="text" class="form-control" id="numero" placeholder="" value="" required="" name="imagem1">
                    </div>
                     <div class="col-md-3 mb-3">
                    Descrição Imagem 2 :
                    <input type="text" class="form-control" id="numero" placeholder="" value="" required="" name="imagem2">
                    </div>
                     <div class="col-md-3 mb-3">
                    Descrição Imagem 3 :
                    <input type="text" class="form-control" id="numero" placeholder="" value="" required="" name="imagem3">
                    </div>
                </div>        
                 <div class="row">
                    <div class="col-md-3 mb-3">
                    Peso :
                    <input type="text" class="form-control" id="cpf" placeholder="" value="" required="" name="peso">
                    </div>
                    <div class="col-md-3 mb-3">
                    Preço :
                    <input type="text" class="form-control" id="rg" placeholder="" value="" required="" name="preco">
                    </div>
                    <div class="col-md-3 mb-3">
                    Data de Vencimento
                    <input type="text" class="form-control" id="dataDeNascimento" placeholder="" value="" required="" name="dataVencimento">
                     </div>
                </div>                                 
    </table>
    <div class="container">
        <div class="row">
            <div class="col-md-3 mb-3">
            <button class="btn btn-primary btn-lg" type="submit" id="inserir">Inserir Produto</button>
            </div>
            <div class ="col-md-3 mb-3">
            <button class="btn btn-primary btn-lg" type="reset">Limpar Dados</button>
            </div>  
            <div class ="col-md-3 mb-3">
                <p> <a class="btn btn-primary btn-lg" href="ProdutoServlet?action=retorno">Retornar</a></p>
            </div>  
        </div>
    </div>
  </div>             
</form>

</div>
        
</body>   
</html>
