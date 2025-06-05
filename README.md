# 📅 40-Day Learning Plan – Spring Framework with Kotlin

This is my personal 40-day challenge to learn and document the Spring Framework using Kotlin and PostgreSQL.  
Each day includes a README with a short summary, one or more classes, and corresponding tests – without using Mockito.
Short periodic lessons for working on habits

---

## 🧭 Week 1: Kotlin + Spring Boot Basics

| Day | Topic |
|-----|-------|
| 1 | Kotlin syntax basics – variables, functions, data classes |
| 2 | Create Spring Boot project with Kotlin + Gradle |
| 3 | Project structure & configuration (application.yml, Gradle KTS) |
| 4 | First REST controller in Kotlin |
| 5 | Request mapping – `@RequestParam`, `@PathVariable`, `@RequestBody` |
| 6 | Basic DTOs and response objects |
| 7 | Summary, refactor & test REST controller with MockMvc (no Mockito) |

---

## 🧭 Week 2: Working with PostgreSQL + JPA

| Day | Topic |
|-----|-------|
| 8 | PostgreSQL setup and connection in Spring Boot |
| 9 | Define entity classes with Kotlin – `@Entity`, `@Id`, `@GeneratedValue` |
|10 | Creating repositories – `JpaRepository`, custom queries |
|11 | CRUD operations with Spring Data JPA |
|12 | Entity relationships – OneToMany, ManyToOne |
|13 | Using DTOs in service & controller layers |
|14 | JPA testing with H2 (in-memory) + `@DataJpaTest` |

---

## 🧭 Week 3: Validation, Exceptions, Profiles, Properties

| Day | Topic |
|-----|-------|
|15 | Bean validation with `@Valid`, `@NotNull`, `@Size` |
|16 | Global error handling with `@ControllerAdvice` |
|17 | Application profiles (`@Profile`) & profile-specific properties |
|18 | External configuration: `application.yml`, env variables |
|19 | Use `@Value` and configuration classes (`@ConfigurationProperties`) |
|20 | Refactor: move config, model, controller to clean packages |

---

## 🧭 Week 4: Spring Security with JWT

| Day | Topic |
|-----|-------|
|21 | Intro to Spring Security – how filters and chains work |
|22 | Securing endpoints with basic auth |
|23 | Create login & registration endpoints |
|24 | Implement JWT generation and validation |
|25 | Store users in DB with roles |
|26 | Secure routes with `@PreAuthorize`, `@Secured` |
|27 | Integration testing secured endpoints |

---

## 🧭 Week 5: AOP, Events, Testing

| Day | Topic |
|-----|-------|
|28 | Application events: `@EventListener`, custom events |
|29 | Aspect-Oriented Programming: `@Aspect`, `@Around` |
|30 | Spring Boot Actuator – monitoring and health checks |
|31 | OpenAPI / Swagger documentation |
|32 | Manual test coverage + writing integration tests for services |
|33 | Building custom exceptions and exception mappers |
|34 | Structured logging and request tracing |

---

## 🧭 Week 6: Final Project

| Day | Topic |
|-----|-------|
|35 | Project setup: new app with REST API and DB |
|36 | Auth, registration, and secured routes |
|37 | Core business logic with validation and JPA |
|38 | Tests for all layers (controller, service, repo) |
|39 | API documentation and production profile setup |
|40 | Code cleanup, summary, final commit 🎉 |

---

## 🔁 Notes

- All examples will be written in Kotlin using Spring Boot and PostgreSQL.
- Tests will use JUnit 5 and MockMvc – without using Mockito.
- Each folder `dayXX-topic` contains source code and `README.md`.
