
# DummyJSON Client - Java 17 e Spring Boot 3.2.5

## Descrição do Projeto

Este projeto é um microsserviço Java que interage com a API pública [DummyJSON](https://dummyjson.com/docs/products) para realizar operações de busca de produtos. O projeto foi desenvolvido usando Java 17 e Spring Boot 3.2.5.

## Objetivo do Desafio


O desafio consiste em migrar este projeto para Java 17 e Spring Boot 3.2.5. Durante a migração, você enfrentará várias dificuldades, incluindo a adaptação ao novo namespace, substituição de métodos depreciados e ajustes em testes unitários.

## Funcionalidades

- **Consulta de Produtos**: Realiza chamadas para a API do DummyJSON para buscar informações sobre produtos.
- **Integração com `OpenFeign`**: Utiliza `OpenFeign` para realizar chamadas HTTP.
- **Validação de Dados**: Validação de dados de entrada usando Bean Validation (`javax.validation`).
- **Gestão de Dependências**: Configurado para utilizar @Autowired.
- **Testes Integrados**: Inclui testes integrados desenvolvidos com SpringBootTest e MockMvc.

## Estrutura do Projeto

```bash
dummyjson-client
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.dummyjsonclient
│   │   │       ├── DummyJsonClientApplication.java
│   │   │       ├── config
│   │   │       │   └── FooConfiguration.java
│   │   │       ├── controller
│   │   │       │   └── ProductController.java
│   │   │       ├── dto
│   │   │       │   ├── Product.java
│   │   │       │   └── ProductList.java
│   │   │       └── service
│   │   │           └── ProductService.java
│   │   └── resources
│   │       └── application.yaml
│   └── test
│       ├── java
│       │   └── com.example.dummyjson
│       │       ├── DummyJsonClientApplicationTest.java
│       │       └── ProductControllerTest.java
│       └── resources
│            └── application.yaml
├── docker-compose.yaml
├── Dockerfile
├── pom.xml
└── setup.sh
```

## Passos para Executar o Projeto

### Pré-requisitos

- **Java 17**
- **Maven 3.8.x**

### Executar a Aplicação

1. Clone o repositório:

    ```bash
    git clone https://github.com/LeonardoSlonzo/code-challenge-migration.git
    cd dummyjson-client
    ```

2. Compile e execute o projeto:
   1. Para executar pelo maven:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
   2. Para executar em container no Docker:
    ```bash
    docker compose up -d
    ```

3. Acesse o serviço:

    O serviço estará disponível em `http://localhost:8080`.\
    Endpoint de buscar todos os produtos: `http://localhost:8080/api/products`. \
    Endpoint de buscar produtos por ID: `http://localhost:8080/api/products/{id}`. \
    Endpoint de saúde do microserviço: `http://localhost:8080/actuator/health/`. 

### Executar Testes

Para executar os testes integrados:

```bash
mvn clean test
```

## Requisitos de Entrega

1. Atualizar o `pom.xml` para usar Java 17+ e Spring Boot 3.2.5.
2. Substituir `RestTemplate` por `WebClient` ou `Openfeign`.
3. Substituir os testes unitários feitos com `JUnit 4` e `Mockito` por testes de integração utilizando `@SpringBootTest`.
4. Refatorar qualquer código depreciado ou incompatível.
5. Garantir que todos os testes ainda passam após a migração.
6. Deixar a URL da API dummyjson parametrizada por ambiente no projeto.
7. Adicionar no projeto um novo path `/health` que retorna a saude do microsserviço.

## Validação Sobre o Challenge

- O projeto deve estar funcionando em Java 17 e Spring Boot 3.2.5.
- Todos os testes unitários devem ser executados e passar sem falhas.
- O código deve estar devidamente documentado e organizado.

## Extras

- Entregar o projeto em container será um diferencial.
- Fica a critério do desenvolvedor inserir ou remover dependencias do projeto para garantir o objetivo do challenge.
