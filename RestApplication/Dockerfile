FROM openjdk:15.0.1

COPY target/*.jar /application.jar

ENTRYPOINT ["java", "-jar", "/application.jar", "--spring.profiles.active=prod"]
