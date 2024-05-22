# Usar una imagen base con JDK
FROM openjdk:17-jdk-alpine

# Crear un directorio en el contenedor para la aplicación
VOLUME /tmp

# Copiar el archivo JAR de la aplicación en el contenedor
ARG JAR_FILE=target/poc-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Definir el comando de inicio para la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]