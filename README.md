# Spring Security API

API desenvolvida com Spring Boot para demonstrar autenticação e autorização com Spring Security e JWT.

## Sobre o projeto

O projeto implementa um sistema simples de gerenciamento de produtos com controle de acesso baseado em perfis.

Existem dois tipos de usuário:

- `ADMIN`: pode cadastrar, listar, atualizar e remover produtos
- `USER`: pode apenas listar produtos

A autenticação é feita via login, com geração de token JWT.  
A autorização dos endpoints é controlada com Spring Security e anotações como `@PreAuthorize`.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database
- JWT
- Maven
- Lombok

## Variáveis de ambiente

Para executar o projeto, configure as seguintes variáveis de ambiente na sua IDE ou no sistema:

```env
API_SECURITY_TOKEN_SECRET=token-teste-api
SPRING_DATASOURCE_USERNAME=devlpsouza
SPRING_DATASOURCE_PASSWORD=luan@123
