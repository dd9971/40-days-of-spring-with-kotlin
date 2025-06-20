# 🧩 Day 4 – Project structure & configuration (Gradle KTS, `dev` profile, packages)

## ✅ What was done:

### 1. Project structure
- Created main folders (packages):
    - `controller`
    - `service`
    - `repository`
    - `model`
    - `config`
- This helps keep the code clean and easy to manage.

### 2. Gradle configuration (`build.gradle.kts`)
- Updated the Gradle file with:
    - Spring Boot and Kotlin dependencies (Web, JPA, Security)
    - PostgreSQL driver and DevTools
    - Test libraries like Testcontainers
    - Set Java version to 21
    - Added a custom Gradle task `runDev` to start the app with the `dev` profile

### 3. `dev` profile setup
- Prepared configuration for environments (to be done in `application.yml` and `application-dev.yml`)
- Set the default profile to `dev`

### 4. `AppConfig.kt` configuration class
- Created a config class with `@Configuration`
- Added:
    - A custom `ObjectMapper` to work with Kotlin and format dates
    - A `DateTimeFormatter` with the pattern `yyyy-MM-dd HH:mm:ss`
    - A simple CORS setup (e.g. for React frontend on `localhost:3000`)

### 5. Tests for configuration
- Created `AppConfigTest.kt` with tests for:
    - Checking if the `ObjectMapper` bean works correctly
    - Checking if the `DateTimeFormatter` formats date as expected
    - Verifying that the CORS config bean exists

---

## 🎯 Final result:
You now have a working and clean project base. The code is organized, Gradle is configured, the `dev` profile is ready, and key configuration beans are tested. The app is ready for next steps like building APIs or writing business logic.

