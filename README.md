# JavaProjetoDesafioTecnico
Teste Técnico - Back End - Attornatus


**DOCUMENTAÇÂO**


- **Dependencias necessarias**
Certifique-se de que você tenha o Spring Boot instalado e crie um novo projeto Spring Boot usando o Spring Initializr (https://start.spring.io/).
Spring Web, Spring Data JPA, H2 Database e Spring Boot DevTools.

Este documento fornece informações e uma visão geral do projeto do desafio apresentado para a vaga de trabalho
focando principalmente no gerencimaento de pessoas e seus endereços



- Requisitos de Sistema
Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

Java Development Kit (JDK) 8 ou superior
Maven (para compilação e gerenciamento de dependências)
Um ambiente de desenvolvimento integrado (IDE) como o Eclipse, IntelliJ IDEA ou Spring Tool Suite (STS)


- Configuração do banco de Dados
esse projeto utiliza banco de dados H2, com suas configurações definidas no arquivo
src/main/resources/application.properties

- Execução do projeto pelo terminal
No diretorio Raiz, execute o comando Maven para compilar o projeto
mvn clean install

após a compilação ser concluida inicie com  o comando
mvn spring-boot:run

A APLICAÇÃO SERÁ EXECUTADA NA PORTA PADRÃO 8080.


- Api e seus Endpoints:

#Pessoas:

Criar pessoa: POST /api/pessoas

Editar pessoa: PUT /api/pessoas/{id}

Consultar pessoa por ID: GET /api/pessoas/id

Listar todas as pessoas: GET /api/ṕessoas

#Endereços

Criar Endereço: POST /api/pessos/{pessoaId}/enderecos7

Listar endereços de uma pessoa: GET /api/pessoas/{pessoasId}/enderecos

Definir endereço principal

/api/pessoas/{pessoaId}/enderecos/{enderecoId}/principal


-Exemplos de requisições: 
Criar Pessoa: 
curl -X POST -H "Content-Type: application/json" -d '{
  "nome": "Italo",
  "dataNascimento": "2000-18-05"
}' http://localhost:8080/api/pessoas


Editar pessoa: 
curl -X PUT -H "Content-Type: application/json" -d '{
  "nome": "Italo",
  "dataNascimento": "2000-18-05"
}' http://localhost:8080/api/pessoas/1



Consultar pessoa por ID
curl http://localhost:8080/api/pessoas/1


Criar Endereço: 
curl -X POST -H "Content-Type: application/json" -d '{
  "logradouro": "Rua A",
  "cep": "12345-678",
  "numero": "123",
  "cidade": "Exemplo"
}' http://localhost:8080/api/pessoas/1/enderecos

