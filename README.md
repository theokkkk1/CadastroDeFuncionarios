🏢 Employee Management API
API REST para gerenciamento de colaboradores desenvolvida com Java 21 e Spring Boot 3.4. O projeto foca em arquitetura resiliente, versionamento de banco de dados e documentação automatizada, servindo como base para sistemas de RH e ERPs.

🎯 Escopo do Projeto
O sistema provê uma solução completa para o ciclo de vida do registro de funcionários, garantindo integridade de dados e separação clara de responsabilidades através de uma arquitetura em camadas.

Gestão de Registros: CRUD completo (Criação, Leitura, Atualização e Deleção).

Persistência Transacional: Garantia de consistência em operações de escrita via Spring Data JPA.

Versionamento de Schema: Evolução do banco de dados controlada por scripts SQL (Flyway).

Contrato de API: Documentação técnica padronizada via OpenAPI 3.0.

🛠️ Stack Técnica
Linguagem: Java 21 (Records e Pattern Matching).

Framework: Spring Boot 3.4+ (Web, Data JPA, Validation).

Banco de Dados: H2 Database (Runtime in-memory).

Migrations: Flyway.

Documentação: Swagger UI / SpringDoc.

Build: Maven.

📐 Estrutura de Domínio
A entidade principal Employee é composta pelos seguintes atributos obrigatórios:

id: Identificador único (Auto-increment).

name: Nome completo do colaborador.

role: Cargo ou função técnica.

salary: Remuneração (Precisão decimal).

createdAt: Registro temporal de inserção.

🧩 Camadas da Aplicação
Controller: Gerenciamento de protocolos HTTP e status codes.

Service: Validações e lógica de negócio.

Repository: Interface de comunicação com o banco H2.

DTO: Camada de transferência para segurança dos dados internos.
