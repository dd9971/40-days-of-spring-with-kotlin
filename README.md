# 📅 40-Day Learning Plan – Spring Framework with Kotlin

This is my personal 40-day challenge to learn and document the Spring Framework using Kotlin and PostgreSQL.  
Each day includes a README with a short summary, one or more classes, and corresponding tests – without using Mockito.
Short periodic lessons for working on habits

---

## 🧭 Week 1: Kotlin + Spring Boot Basics

| Day | Topic                                                                                  |
| --- |----------------------------------------------------------------------------------------|
| 1   | PostgreSQL configuration in Spring Boot (DB setup, connection test, `application.yml`) |
| 2   | Kotlin syntax basics – variables, functions, data classes                              |
| 3   | Spring Data JPA - entity, repository, CRUD                                             |
| 4   | Project structure & configuration (Gradle KTS, `dev` profile, packages)                |
| 5   | First REST controller in Kotlin                                                        |
| 6   | Request mapping – `@RequestParam`, `@PathVariable`, `@RequestBody`                     |
| 7   | Summary, refactor & testing REST controller with `MockMvc` (no Mockito)                |


---

## 🧭 Week 2: Working with PostgreSQL + JPA

| Day | Topic                                                                                             |
| --- | ------------------------------------------------------------------------------------------------- |
| 8   | JPA basics – entities, annotations (`@Entity`, `@Id`, `@GeneratedValue`), DTOs                    |
| 9   | Creating repositories – `JpaRepository`, custom queries                                           |
| 10  | CRUD operations with Spring Data JPA                                                              |
| 11  | Entity relationships – OneToMany, ManyToOne                                                       |
| 12  | Databases comparison: Relational vs. Document DBs (PostgreSQL vs. MongoDB – theoretical overview) |
| 13  | Seeding initial data (`data.sql`, `CommandLineRunner`)                                            |
| 14  | JPA testing with H2 (in-memory DB) + `@DataJpaTest`                                               |


---

## 🧭 Week 3: Validation, Exceptions, Profiles, Properties

| Day | Topic                                                                 |
| --- | --------------------------------------------------------------------- |
| 15  | Bean validation (`@Valid`, `@NotNull`, `@Size`)                       |
| 16  | Global error handling with `@ControllerAdvice`                        |
| 17  | Application profiles (`@Profile`) & profile-specific properties       |
| 18  | External configuration: `application.yml`, environment variables      |
| 19  | Using `@Value` & configuration classes (`@ConfigurationProperties`)   |
| 20  | Refactoring packages (config, model, controller) into clean structure |


---

## 🧭 Week 4: Spring Security with JWT

| Day | Topic                                                |
| --- | ---------------------------------------------------- |
| 21  | Introduction to Spring Security (filters & chains)   |
| 22  | Securing endpoints with Basic Authentication         |
| 23  | Creating login & registration endpoints              |
| 24  | JWT implementation – token generation and validation |
| 25  | Storing users & roles in PostgreSQL                  |
| 26  | Securing routes with `@PreAuthorize`, `@Secured`     |
| 27  | Integration testing secured endpoints                |


---

## 🧭 Week 5: AOP, Events, Testing

| Day | Topic                                                 |
| --- | ----------------------------------------------------- |
| 28  | Application events: `@EventListener`, custom events   |
| 29  | Aspect-Oriented Programming: `@Aspect`, `@Around`     |
| 30  | Spring Boot Actuator – monitoring and health checks   |
| 31  | OpenAPI / Swagger API documentation                   |
| 32  | Manual test coverage & integration tests for services |
| 33  | Building custom exceptions & exception handling       |
| 34  | Structured logging & request tracing                  |


---

## 🧭 Week 6: Final Project

| Day | Topic                                                  |
| --- | ------------------------------------------------------ |
| 35  | Project setup – new REST API application with DB       |
| 36  | Authentication, registration & secured routes          |
| 37  | Core business logic with validation & JPA              |
| 38  | Tests for all layers (controller, service, repository) |
| 39  | API documentation & production profile setup           |
| 40  | Code cleanup, summary & final commit 🎉                |


---

## 🔁 Notes

- All examples will be written in Kotlin using Spring Boot and PostgreSQL.
- Tests will use JUnit 5 and MockMvc – without using Mockito.
- Each folder `dayXX-topic` contains source code and `README.md`.
