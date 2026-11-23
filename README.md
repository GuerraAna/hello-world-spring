# hello-world-spring

Projeto **Hello World com Spring Boot** — primeiro contato com backend Java/Spring.

## Objetivo

Base de estudo de Spring Boot: estrutura de projeto gerada pelo Spring Initializr, controller REST e endpoints do Actuator.

## Tecnologias

- **Java 17**
- **Spring Boot 3.5.3**
- `spring-boot-starter-web` (REST)
- `spring-boot-starter-actuator` (health/metrics)
- Lombok
- Gradle 8.14.2 (Kotlin DSL)

## Pré-requisitos

- **JDK 17** (Spring Boot 3.x exige Java 17+)

## Como rodar

```bash
cd hello-world
./gradlew bootRun          # sobe em http://localhost:8080
```

Endpoints úteis:

- `GET /actuator/health` — status da aplicação

Testes:

```bash
./gradlew test
```
