CREATE SCHEMA `semeando_futuro`;

CREATE USER 'admin'@'localhost' identified BY 'admin';

GRANT ALL ON *.* TO 'admin'@'localhost' WITH grant option;
flush privileges;

use semeando_futuro;


CREATE TABLE Login (
  idLogin INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Usuario VARCHAR(25)  NULL  ,
  Senha VARCHAR(8)  NULL    ,
PRIMARY KEY(idLogin));



CREATE TABLE Funcionario (
  idFuncionario INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Nome VARCHAR(50)  NULL  ,
  Sobrenome VARCHAR(100)  NULL  ,
  EnderecoFun VARCHAR(255)  NULL  ,
  Nº INT  NULL  ,
  Bairro VARCHAR(100)  NULL  ,
  Cep NUMERIC  NULL  ,
  Cidade VARCHAR(100)  NULL  ,
  Telefone CHAR(15)  NULL  ,
  Estado_Civil VARCHAR(50)  NULL  ,
  Sexo VARCHAR(1)  NULL  ,
  Nascimento DATE  NULL  ,
  Local_Nascimento VARCHAR(100)  NULL  ,
  Nome_Esposa VARCHAR(100)  NULL  ,
  Filiacao VARCHAR(100)  NULL  ,
  Moradia VARCHAR(100)  NULL  ,
  Cart_Profissional VARCHAR(100)  NULL  ,
  Serie VARCHAR(25)  NULL  ,
  Data_de_Emissao DATE  NULL  ,
  UF VARCHAR(2)  NULL  ,
  Identidade CHAR(25)  NULL  ,
  Data_da_emissao DATE  NULL  ,
  Orgao_emissor_identidade VARCHAR(50)  NULL  ,
  Titulo_de_eleitor CHAR(20)  NULL  ,
  Zona VARCHAR(25)  NULL  ,
  Seccao VARCHAR(25)  NULL  ,
  Certificado_Reservista CHAR(20)  NULL  ,
  Orgao_Emissor_certificado VARCHAR(50)  NULL  ,
  Pis CHAR(20)  NULL  ,
  CPF CHAR(14)  NULL  ,
  Escolaridade VARCHAR(50)  NULL  ,
  Primeiro_Emprego VARCHAR(50)  NULL    ,
PRIMARY KEY(idFuncionario));



CREATE TABLE Mae (
  idMae INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Nome VARCHAR(50)  NULL  ,
  Sobrenome VARCHAR(100)  NULL  ,
  Estado VARCHAR(2)  NULL  ,
  Cidade VARCHAR(30)  NULL  ,
  Bairro VARCHAR(50)  NULL  ,
  Endereco VARCHAR(100)  NULL  ,
  CEP CHAR(9)  NULL  ,
  Telefone CHAR(14)  NULL  ,
  Celular CHAR(15)  NULL  ,
  Email VARCHAR(255)  NULL  ,
  Profissao VARCHAR(100)  NULL  ,
  Empresa_Trabalho VARCHAR(50)  NULL  ,
  Funcao VARCHAR(50)  NULL  ,
  Estado_Civil VARCHAR(25)  NULL  ,
  RG CHAR(12)  NULL  ,
  CPF CHAR(14)  NULL  ,
  An_RG LONGBLOB  NULL  ,
  An_CPF LONGBLOB  NULL    ,
PRIMARY KEY(idMae));



CREATE TABLE Turma (
  idTurma INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Nome VARCHAR(100)  NULL  ,
  Ano YEAR  NULL  ,
  Serie INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(idTurma));



CREATE TABLE Pai (
  idPai INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Nome VARCHAR(50)  NULL  ,
  Sobrenome VARCHAR(100)  NULL  ,
  Estado VARCHAR(2)  NULL  ,
  Cidade VARCHAR(30)  NULL  ,
  Bairro VARCHAR(50)  NULL  ,
  Endereço VARCHAR(100)  NULL  ,
  CEP CHAR(9)  NULL  ,
  Telefone CHAR(14)  NULL  ,
  Celular CHAR(15)  NULL  ,
  Email VARCHAR(255)  NULL  ,
  Profissao VARCHAR(100)  NULL  ,
  Empresa_Trabalho VARCHAR(50)  NULL  ,
  Funcao VARCHAR(50)  NULL  ,
  Estado_Civil VARCHAR(25)  NULL  ,
  RG CHAR(12)  NULL  ,
  CPF CHAR(14)  NULL  ,
  An_RG LONGBLOB  NULL  ,
  An_CPF LONGBLOB  NULL    ,
PRIMARY KEY(idPai));



CREATE TABLE Banco_Horas (
  idBanco_Horas INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Funcionario_idFuncionario INTEGER UNSIGNED  NOT NULL  ,
  Horas INTEGER UNSIGNED  NULL  ,
  Data_bh DATE  NULL    ,
PRIMARY KEY(idBanco_Horas)  ,
INDEX idFuncionario(Funcionario_idFuncionario),
  FOREIGN KEY(Funcionario_idFuncionario)
    REFERENCES Funcionario(idFuncionario)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Faltas (
  idFaltas INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Funcionario_idFuncionario INTEGER UNSIGNED  NOT NULL  ,
  Data_Falta DATE  NULL  ,
  Motivo_Falta VARCHAR(255)  NULL    ,
PRIMARY KEY(idFaltas)  ,
INDEX idFuncionario(Funcionario_idFuncionario),
  FOREIGN KEY(Funcionario_idFuncionario)
    REFERENCES Funcionario(idFuncionario)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Hora_Cafe (
  idHora_Cafe INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Funcionario_idFuncionario INTEGER UNSIGNED  NOT NULL  ,
  Data_cafe DATE  NULL  ,
  Hora_cafe TIME  NULL    ,
PRIMARY KEY(idHora_Cafe)  ,
INDEX idFuncionario(Funcionario_idFuncionario),
  FOREIGN KEY(Funcionario_idFuncionario)
    REFERENCES Funcionario(idFuncionario)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Aluno (
  idAluno INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Turma_idTurma INTEGER UNSIGNED  NOT NULL  ,
  Mae_idMae INTEGER UNSIGNED  NOT NULL  ,
  Pai_idPai INTEGER UNSIGNED  NOT NULL  ,
  Nome VARCHAR(50)  NULL  ,
  Sobrenome VARCHAR(100)  NULL  ,
  Dt_Nascimento DATE  NULL  ,
  RA VARCHAR(25)  NULL  ,
  Mensalidade DOUBLE  NULL  ,
  An_Res LONGBLOB  NULL  ,
  An_NAsc LONGBLOB  NULL  ,
  An_Vacina LONGBLOB  NULL    ,
PRIMARY KEY(idAluno)  ,
INDEX idPai(Pai_idPai)  ,
INDEX idMae(Mae_idMae)  ,
INDEX idTurma(Turma_idTurma),
  FOREIGN KEY(Pai_idPai)
    REFERENCES Pai(idPai)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Mae_idMae)
    REFERENCES Mae(idMae)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Turma_idTurma)
    REFERENCES Turma(idTurma)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Desligamento (
  idDesligamento INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Aluno_idAluno INTEGER UNSIGNED  NOT NULL  ,
  Data_Desl DATE  NULL  ,
  Motivo VARCHAR(255)  NULL    ,
PRIMARY KEY(idDesligamento)  ,
INDEX idAluno(Aluno_idAluno),
  FOREIGN KEY(Aluno_idAluno)
    REFERENCES Aluno(idAluno)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Calendario (
  id_festa INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Aluno_idAluno INTEGER UNSIGNED  NOT NULL  ,
  Nome VARCHAR(50)  NULL  ,
  Data_Festa DATE  NULL  ,
  Pagamento DOUBLE  NULL  ,
  Observacao VARCHAR(255)  NULL    ,
PRIMARY KEY(id_festa)  ,
INDEX idAluno(Aluno_idAluno),
  FOREIGN KEY(Aluno_idAluno)
    REFERENCES Aluno(idAluno)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Devedores (
  idDevedores INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Aluno_idAluno INTEGER UNSIGNED  NOT NULL  ,
  Mensalidade DOUBLE  NULL  ,
  Obs TEXT  NULL  ,
  Estado VARCHAR(50)  NULL    ,
PRIMARY KEY(idDevedores)  ,
INDEX idAluno(Aluno_idAluno),
  FOREIGN KEY(Aluno_idAluno)
    REFERENCES Aluno(idAluno)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Presenca (
  idPresenca INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  Aluno_idAluno INTEGER UNSIGNED  NOT NULL  ,
  Funcionario_idFuncionario INTEGER UNSIGNED  NOT NULL  ,
  Data_Pres DATE  NULL  ,
  Aulas INTEGER UNSIGNED  NULL  ,
  Faltas INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(idPresenca)  ,
INDEX idFuncionario(Funcionario_idFuncionario)  ,
INDEX idAluno(Aluno_idAluno),
  FOREIGN KEY(Funcionario_idFuncionario)
    REFERENCES Funcionario(idFuncionario)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Aluno_idAluno)
    REFERENCES Aluno(idAluno)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);




