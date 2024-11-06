# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar
# Copy the built JAR file into the container
COPY ./target/tweet-api-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot app runs on (default is 8080)
EXPOSE 9091

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
