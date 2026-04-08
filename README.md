👨‍💼 Employee Management API

API REST desenvolvida com Java e Spring Boot para gerenciamento de funcionários, aplicando boas práticas de arquitetura em camadas (MVC) e integração com banco de dados.

📌 Sobre o Projeto

Este projeto tem como objetivo implementar uma API completa para cadastro e gerenciamento de funcionários, simulando um sistema real de controle corporativo.

A aplicação foi construída seguindo princípios de engenharia de software, com separação de responsabilidades e organização em camadas (Controller, Service, Repository e Model).

🚀 Tecnologias Utilizadas
Java
Spring Boot
Spring Web
Spring Data JPA
H2 Database
Flyway (Migration)
Swagger (OpenAPI)
Maven
Git
🏗️ Arquitetura

O projeto segue o padrão MVC + Service Layer, garantindo organização e escalabilidade:

Controller: Responsável pelos endpoints da API
Service: Contém as regras de negócio
Repository: Comunicação com o banco de dados
Model: Representação das entidades
⚙️ Funcionalidades
Cadastro de funcionários
Listagem de funcionários
Atualização de dados
Remoção de funcionários
Controle estruturado de dados
Documentação automática da API com Swagger
🗄️ Banco de Dados
Banco em memória utilizando H2
Versionamento de banco com Flyway Migration
Scripts SQL organizados para criação e evolução das tabelas
📡 Endpoints
Método	Rota	Descrição
POST	/funcionarios	Cadastrar funcionário
GET	/funcionarios	Listar todos
GET	/funcionarios/{id}	Buscar por ID
PUT	/funcionarios/{id}	Atualizar funcionário
DELETE	/funcionarios/{id}	Remover funcionário
📑 Documentação (Swagger)

Após rodar a aplicação, acesse:

http://localhost:8080/swagger-ui.html

Interface interativa para testar todos os endpoints da API.

▶️ Como Executar o Projeto
1. Clonar o repositório
git clone https://github.com/theokkkk1/employee-management-api.git
cd employee-management-api
2. Executar a aplicação
./mvnw spring-boot:run

ou

mvn spring-boot:run
3. Acessar
API: http://localhost:8080
Swagger: http://localhost:8080/swagger-ui.html
H2 Console: http://localhost:8080/h2-console
🧪 Testes

Os endpoints podem ser testados via:

Swagger UI
Postman
