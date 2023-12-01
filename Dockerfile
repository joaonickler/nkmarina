FROM maven:3.9.3-eclipse-temurin-17-alpine AS build
COPY . .
RUN mvn clean install

FROM openjdk:17-jdk-alpine
EXPOSE 8080
COPY --from=build target/marina-0.0.1-SNAPSHOT app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
