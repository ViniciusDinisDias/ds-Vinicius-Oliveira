create database if not exists bancodedados;
use bancodedados;
drop table if exists alunos;
create table alunos
(
codigo_aluno varchar(45),
nome_aluno varchar(45)
);

select * from alunos;