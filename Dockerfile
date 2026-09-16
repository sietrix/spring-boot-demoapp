FROM eclipse-temurin:8-jre-alpine
# Asegura que solo se copie el jar ejecutable final (ajusta el nombre si es necesario)
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "/app.jar"]

# Versión original
#FROM openjdk:8-jdk-alpine
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/urandom","-jar","/app.jar"]
