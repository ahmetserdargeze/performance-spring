FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
ENV DATABASE_URL jdbc:postgresql://db:5432/postgres
ENV DATABASE_USER postgres
ENV DATABASE_PASS postgres

ARG JAR_FILE
COPY /target/performance-0.0.1-SNAPSHOT.jar /performance-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/performance-0.0.1-SNAPSHOT.jar"]