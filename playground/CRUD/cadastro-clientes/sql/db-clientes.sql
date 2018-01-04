-- Criando base de dados
CREATE DATABASE cliente_prod 
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

USE cliente_prod;

-- Criando a tabela de clientes
CREATE TABLE clientes(
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(65),
    profissao VARCHAR(20),
    cpf VARCHAR(30),
	endereco VARCHAR(60),
    nacionalidade VARCHAR(40) DEFAULT 'Brasil',
	PRIMARY KEY(id)
)DEFAULT CHARSET = utf8;

-- Visualizando resultado
DESCRIBE clientes;

SELECT * from clientes;