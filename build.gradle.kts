plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	kotlin("plugin.jpa") version "1.9.25"

	id("org.springframework.boot") version "3.2.5"
	id("io.spring.dependency-management") version "1.1.5"
}

group = "com.fortyday"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(21))
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// Spring Boot Starters
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-security")

	// Kotlin
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

	// PostgreSQL driver
	runtimeOnly("org.postgresql:postgresql")

	// Lombok
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	// Dev tools
	developmentOnly("org.springframework.boot:spring-boot-devtools")

	// Tests
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testImplementation("org.springframework.security:spring-security-test")

	// Testcontainers
	testImplementation("org.testcontainers:junit-jupiter:1.21.1")
	testImplementation("org.testcontainers:postgresql:1.21.1")
	testImplementation("org.testcontainers:testcontainers:1.21.1")

	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

allOpen {
	annotation("jakarta.persistence.Entity")
	annotation("jakarta.persistence.MappedSuperclass")
	annotation("jakarta.persistence.Embeddable")
}

tasks.withType<Test> {
	useJUnitPlatform()
}


tasks.register<JavaExec>("runDev") {
	group = "application"
	mainClass.set("com.fortyday.challenge.DevApplication")
	classpath = sourceSets["main"].runtimeClasspath
	args = listOf("--spring.profiles.active=dev")
}
