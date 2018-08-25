create database cadastro;
use cadastro;

create table usuario (
	id int auto_increment primary key,
    nome varchar(100),
    login varchar(50),
    senha varchar(50)
);


insert into usuario (nome, login, senha)
values 
('Leticia Monteiro','leticia123',md5('123456'))


insert into usuario (nome, login, senha)
values 
('Daniel Souza','daniel123',md5('123456'))