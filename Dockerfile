FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/deployApp-0.0.1.jar
COPY ${JAR_FILE} deployApp.jar
ENTRYPOINT ["java", "-jar", "deployApp.jar"]