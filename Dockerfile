FROM eclipse-temurin:21-jdk-alpine

LABEL authors="gosuto-san"

WORKDIR /app

COPY /target/produit.jar ./produit.jar

EXPOSE 8084

CMD [ "java", "-jar", "produit.jar" ]