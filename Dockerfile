FROM eclipse-temurin:21-jdk
WORKDIR /app

COPY java_training/target/*.jar app.jar

# Command to run the Java app
ENTRYPOINT ["java", "-jar", "app.jar"]