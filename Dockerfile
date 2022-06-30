FROM openjdk:8
ADD target/mineria.jar mineria.jar
ENTRYPOINT ["java", "-jar","mineria.jar"]

