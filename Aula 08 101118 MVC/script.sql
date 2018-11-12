CREATE DATABASE cadastro; 

USE cadastro; 

CREATE TABLE usuario 
  ( 
     id    INT auto_increment PRIMARY KEY, 
     nome  VARCHAR(100), 
     login VARCHAR(20), 
     senha VARCHAR(255) 
  ); 

/* ALTER USER cadastro IDENTIFIED WITH mysql_native_password;*/ 
/*ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';*/ 
-- default_authentication_plugin=mysql_native_password 
INSERT INTO usuario 
            (nome, 
             login, 
             senha) 
VALUES      ('elienai neves', 
             'eneves', 
             Md5('123')); 

INSERT INTO usuario 
            (nome, 
             login, 
             senha) 
VALUES      ('eu', 
             'eu', 
             Md5('123')); 

CREATE TABLE cliente 
  ( 
     id       INT auto_increment PRIMARY KEY, 
     nome     VARCHAR(100), 
     endereco VARCHAR(100), 
     cep      VARCHAR(10), 
     email    VARCHAR(100), 
     telefone VARCHAR(15), 
     estado   CHAR(2) 
  ); 

SET @@global.time_zone = '+00:00'; 

SET @@session.time_zone = '+00:00'; 

CREATE TABLE aluno 
  ( 
     id            INT PRIMARY KEY auto_increment, 
     nome          VARCHAR(30), 
     endereco      VARCHAR(100), 
     dt_nascimento CHAR(8), 
     email         VARCHAR(100), 
     nr_matricula  CHAR(10), 
     cpf           CHAR(20) 
  ); 

INSERT INTO aluno 
            (nome, 
             endereco, 
             dt_nascimento, 
             email, 
             nr_matricula, 
             cpf) 
VALUES     ('euz', 
            'aa', 
            'bb', 
            'cc', 
            'dd', 
            'ee'); 