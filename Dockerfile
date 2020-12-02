FROM openjdk:8-jdk-alpine
RUN mkdir -p /backend
WORKDIR /backend
ARG JAR_FILE=/target/github-project-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /backend/app.jar
ENTRYPOINT ["java","-jar","/backend/app.jar"]