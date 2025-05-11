# Use official OpenJDK image
FROM openjdk:17-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file into the image
COPY target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
