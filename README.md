# CRUD de Usuários com Spring Boot 
### Este é um projeto de API RESTful simples para gerenciar usuários, desenvolvido com Java e Spring Boot. A aplicação permite criar, ler, atualizar e deletar (CRUD) registros de usuários.
## 🚀Começando

### Endpoints da API
### A API fornece os seguintes endpoints para gerenciar usuários:

### 1) Criar Usuário
Cria um novo usuário.

Método: POST <br>
URL: /criar <br>
Corpo da Requisição (JSON):

```JSON
{
  "name": "João da Silva",
  "password": "senhaSegura123",
  "cpf": "123.456.789-00",
  "dataNascimento": "2000-01-15"
}
```

Resposta de Sucesso (201 - CREATED):
```JSON

{
  "id": 1,
  "name": "João da Silva",
  "password": "senhaSegura123",
  "cpf": "123.456.789-00",
  "dataNascimento": "2000-01-15"
}
```

### 2) Listar Todos os Usuários
Retorna uma lista com todos os usuários cadastrados.

Método: GET <br>
URL: /listar <br>
Resposta de Sucesso (200 - OK):
```JSON

[
  {
    "id": 1,
    "name": "João da Silva",
    "password": "senhaSegura123",
    "cpf": "123.456.789-00",
    "dataNascimento": "2000-01-15"
  },
  {
    "id": 2,
    "name": "Maria Oliveira",
    "password": "outraSenha456",
    "cpf": "987.654.321-99",
    "dataNascimento": "1995-05-20"
  }
]
```

### 3) Buscar Usuário por ID
Retorna um usuário específico com base no seu id.

Método: GET <br>
URL: /listar/{id} <br>
Exemplo de URL: /listar/1 <br>
Resposta de Sucesso (200 - OK):
```JSON

{
  "id": 1,
  "name": "João da Silva",
  "password": "senhaSegura123",
  "cpf": "123.456.789-00",
  "dataNascimento": "2000-01-15"
}
```

### 4) Atualizar Usuário
Atualiza os dados de um usuário existente com base no seu id.

Método: PUT <br>
URL: /atualizar/{id} <br>
Exemplo de URL: /atualizar/1 <br>
Corpo da Requisição (JSON):
```JSON

{
  "name": "João da Silva Santos",
  "password": "novaSenhaSuperSegura",
  "cpf": "123.456.789-00",
  "dataNascimento": "2000-01-15"
}
```

Resposta de Sucesso (200 - OK):
```JSON

{
  "id": 1,
  "name": "João da Silva Santos",
  "password": "novaSenhaSuperSegura",
  "cpf": "123.456.789-00",
  "dataNascimento": "2000-01-15"
}
```

### 5) Deletar Usuário
Remove um usuário do sistema com base no seu id.

Método: DELETE <br>
URL: /deletar/{id} <br>
Exemplo de URL: /deletar/1 <br>
Resposta de Sucesso: 204 - NO CONTENT (Sem conteúdo no corpo da resposta).

## 🛠️ Tecnologias Utilizadas
Java: Linguagem de programação principal. <br>
Spring Boot: Framework para criação de aplicações Java. <br>
Spring Data JPA: Para persistência de dados. <br>
Maven: Gerenciador de dependências e build. <br>
H2 Database: Banco de dados em memória para testes.






