create database cadastro;
use cadastro;

ALTER DATABASE `cadastro` CHARSET = UTF8 COLLATE = utf8_general_ci;


create table usuario (
	id int auto_increment primary key,
    nome varchar(100),
    login varchar(50),
    senha varchar(50)
);

insert into usuario (nome, login, senha)
values 
('Leticia Monteiro','leticia123','123456');

insert into usuario (nome, login, senha)
values 
('Daniél Souza','daniel123','123456');

select * from usuario


delete from usuario where id > 0;
ALTER TABLE usuario AUTO_INCREMENT = 1;



