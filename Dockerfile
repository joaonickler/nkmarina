FROM eclipse-temurin:17-jdk-alpine
COPY target/marina-0.0.1-SNAPSHOT app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]
EXPOSE 8080
