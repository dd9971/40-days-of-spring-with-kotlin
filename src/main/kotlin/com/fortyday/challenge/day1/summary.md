# 1st Day ReadMe

## 📋 What We Did

1. **Docker Compose (PostgreSQL)**

    * Created a file `docker-compose.yml` to run PostgreSQL in Docker:

      ```yaml
      services:
        db:
          image: postgres:16-alpine
          environment:
            POSTGRES_USER: postgres
            POSTGRES_PASSWORD: postgres
            POSTGRES_DB: fortydaychallenge
          ports:
            - "5432:5432"
          volumes:
            - pgdata:/var/lib/postgresql/data
      volumes:
        pgdata:
      ```
    * Started the database with:

      ```bash
      docker compose up -d
      ```

2. **Spring Boot Setup**

    * In `src/main/resources/application.yml`, we added:

      ```yaml
      spring:
        datasource:
          url: jdbc:postgresql://localhost:5432/fortydaychallenge
          username: postgres
          password: postgres
        jpa:
          hibernate:
            ddl-auto: update
          show-sql: true
      ```
    * This tells Spring Boot how to connect to the Docker PostgreSQL.

3. **Main Application Code**

    * Created `FirstDay.kt` in `com.fortyday.challenge.day1`:

      ```kotlin
      @SpringBootApplication
      class FirstDay {
          @Bean
          fun testDbConnection(jdbcTemplate: JdbcTemplate) = CommandLineRunner {
              val count = jdbcTemplate.queryForObject("SELECT 1", Int::class.java)
              println("DB test query returned: $count")
          }
      }
 
      fun main(args: Array<String>) {
          runApplication<FirstDay>(*args)
      }
      ```
    * Ran the app:

      ```bash
      ./gradlew clean bootRun
      ```
    * In console we saw:

      ```
      DB test query returned: 1
      ```
    * This means our app can talk to PostgreSQL.

4. **Tell Gradle Which Main to Use**

    * In `build.gradle.kts`, we set:

      ```kotlin
      springBoot {
        mainClass.set("com.fortyday.challenge.day1.FirstDayKt")
      }
      ```
    * This makes Gradle run only our `FirstDay` main.

5. **Integration Tests with Testcontainers**

    * Added to `build.gradle.kts`:

      ```kotlin
      testImplementation("org.testcontainers:junit-jupiter:1.19.7")
      testImplementation("org.testcontainers:postgresql:1.19.7")
      ```
    * Wrote `FirstDayTest.kt`:

      ```kotlin
      @SpringBootTest
      @Testcontainers
      class FirstDayTest {
        companion object {
          @Container @JvmField
          val postgres = PostgreSQLContainer<Nothing>("postgres:16-alpine").apply {
            withDatabaseName("fortydaychallenge")
            withUsername("postgres")
            withPassword("postgres")
          }
 
          @JvmStatic
          @DynamicPropertySource
          fun props(reg: DynamicPropertyRegistry) {
            reg.add("spring.datasource.url", postgres::getJdbcUrl)
            reg.add("spring.datasource.username", postgres::getUsername)
            reg.add("spring.datasource.password", postgres::getPassword)
          }
        }
 
        @Autowired
        lateinit var jdbcTemplate: JdbcTemplate
 
        @Test
        fun `should return 1 from SELECT 1`() {
          val result = jdbcTemplate.queryForObject("SELECT 1", Int::class.java)
          assertThat(result).isEqualTo(1)
        }
      }
      ```
    * Ran tests:

      ```bash
      ./gradlew test
      ```

## 🔑 Key Annotations and Methods

| Annotation / Method              | What It Does                                                 |
| -------------------------------- | ------------------------------------------------------------ |
| `@SpringBootApplication`         | Marks the main Spring Boot application class.                |
| `runApplication`                 | Launches the Spring Boot app in Kotlin.                      |
| `@Bean` + `CommandLineRunner`    | Runs custom code right after the application starts.         |
| `JdbcTemplate.queryForObject`    | Executes a SQL query and returns a single result.            |
| `@SpringBootTest`                | Loads the full Spring context for integration tests.         |
| `@Testcontainers` & `@Container` | Starts and stops Docker containers automatically in tests.   |
| `@JvmField`                      | Makes a Kotlin property a true Java static field.            |
| `@DynamicPropertySource`         | Dynamically sets Spring properties (e.g., DB URL) for tests. |

---

*1st Day of the 40-Day Spring + Kotlin Challenge*
