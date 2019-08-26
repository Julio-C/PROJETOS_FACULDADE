CREATE SCHEMA `projeto_julio` ;

drop schema `projeto_julio`;

use `projeto_julio` ;

create table retangulo (
cod_ret BIGINT NOT NULL AUTO_INCREMENT,
valor1 double,
h double,
b double,
p double,
primary key (cod_ret)
);



create table quadrado (
cod_quad BIGINT NOT NULL AUTO_INCREMENT,
valor1 double,
a double,
p double,
primary key (cod_quad)
);

create table paralelogramo (
cod_par BIGINT NOT NULL AUTO_INCREMENT,
valor1 double,
a double,
b double,
p double,
primary key (cod_par)
);

create table trapezio (
cod_tra BIGINT NOT NULL AUTO_INCREMENT,
a double,
b double,
c double,
d double,
p double,
primary key (cod_tra)
);

select  *from paralelogramo;

insert into paralelogramo ( valor1 , a , b , p) values (1,2,3,4);


