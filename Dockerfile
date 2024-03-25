FROM openjdk:17
COPY build/libs/*.jar annotation.jar
ENTRYPOINT ["java", "-jar", "/annotation.jar"]