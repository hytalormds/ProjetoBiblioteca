# Projeto Biblioteca

Sistema desktop em Java para gerenciamento de biblioteca, com interface gráfica em Swing e acesso a banco de dados MySQL.

## Sobre o projeto

O projeto organiza o cadastro e a manutenção de informações básicas de uma biblioteca, com foco em:

- cadastro de livros
- cadastro de usuários
- controle de empréstimos
- organização em camadas, separando interface, controllers, DAOs e modelos

A interface principal foi construída em Swing e conta com menus para acesso às telas de cadastro.

## Estrutura do projeto

- View: telas gráficas do sistema
- Controller: camada de controle das operações
- DAO: acesso ao banco de dados
- Model: entidades do sistema
- Conecta: classe responsável pela conexão com o MySQL

## Tecnologias utilizadas

- Java
- Swing
- Maven
- MySQL
- JDBC

## Requisitos

Para executar o projeto, você vai precisar de:

- JDK 23 ou superior
- Maven
- MySQL rodando localmente
- Banco de dados bdbiblioteca criado

## Configuração do banco

A conexão com o banco está centralizada na classe Conecta.Conexao.
Antes de executar a aplicação, revise os dados de acesso ao MySQL:

- URL do banco
- usuário
- senha

## Como executar

1. Abra o projeto no NetBeans, IntelliJ IDEA ou outro IDE compatível com Maven.
2. Configure o banco de dados MySQL.
3. Ajuste as credenciais da classe de conexão, se necessário.
4. Execute a classe principal da interface gráfica para abrir a tela inicial.

## Funcionalidades presentes

- Tela principal com menu de cadastros
- Estrutura para cadastro de livros
- Estrutura para cadastro de usuários
- Estrutura para cadastro de empréstimos
- Classes de apoio para autores, editoras, usuários, endereços e empréstimos

## Observações

Este projeto ainda pode receber melhorias em validação, tratamento de erros, organização das telas e finalização de algumas rotinas de persistência.
