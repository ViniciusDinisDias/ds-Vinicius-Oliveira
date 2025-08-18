-- Criar o banco de dados
CREATE DATABASE bancod;

-- Usar o banco
USE banco;

-- Criar tabela alunos
CREATE TABLE alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigo_aluno VARCHAR(20) NOT NULL,
    nome_aluno VARCHAR(100) NOT NULL
);

-- Inserir alguns alunos de exemplo
INSERT INTO alunos (codigo_aluno, nome_aluno) VALUES
('1111', 'Maria Silva'),
('2222', 'João Souza'),
('3333', 'Pedro Santos');
