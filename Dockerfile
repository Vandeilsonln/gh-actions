FROM maven:3.8.7-openjdk-18-slim as build

COPY pom.xml ./
RUN mvn -B clean dependency:resolve dependency:resolve-plugins

COPY src src
RUN mvn -B package -Dunit.skip=true

FROM openjdk:18-slim-buster as release
EXPOSE 8080
COPY --from=build ./target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]