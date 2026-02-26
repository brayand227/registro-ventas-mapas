# Usar imagen oficial de Java 21
FROM eclipse-temurin:21-jdk

# Directorio de trabajo
WORKDIR /app

# Copiar todo el proyecto
COPY . .

# Dar permisos a mvnw
RUN chmod +x mvnw

# Construir la aplicación
RUN ./mvnw clean package -DskipTests

# Exponer el puerto
EXPOSE 8080

# Comando para iniciar la app
CMD ["java", "-jar", "target/registroventas-0.0.1-SNAPSHOT.jar"]