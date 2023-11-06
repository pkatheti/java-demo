

# Use an official OpenJDK 11 image as the base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the "target" directory of your project into the container
COPY /app/target/JavaCrudApis-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 for the application
EXPOSE 8080

# Define the entry point command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]

