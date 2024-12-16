# Étape de build
FROM gradle:8.7-jdk21 AS build

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier TOUS les fichiers, y compris gradle wrapper
COPY . .

# Donner les droits d'exécution au gradlew (s'il existe)
RUN chmod +x gradlew || true

# Construire l'application
RUN ./gradlew clean bootJar --no-daemon

# Étape finale d'exécution
FROM openjdk:21-jdk-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier le jar construit depuis l'étape de build
COPY --from=build /app/build/libs/*.jar app.jar

# Port exposé par l'application
EXPOSE 8080

# Commande pour lancer l'application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
