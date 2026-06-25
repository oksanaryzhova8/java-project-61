plugins {
    checkstyle
    application
    id("com.github.ben-manes.versions") version "0.54.0"
    id("org.sonarqube") version "7.3.1.8318"
}

sonar {
    properties {
        property("sonar.projectKey", "oksanaryzhova8_java-project-61")
        property("sonar.organization", "oksanaryzhova8")
    }
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
