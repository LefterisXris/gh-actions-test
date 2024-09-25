FROM openjdk:17-slim

WORKDIR /app

COPY target/gh-actions-test-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]