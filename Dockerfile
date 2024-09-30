FROM eclipse-temurin:17-jdk-alpine
LABEL authors="Ben Ahmed"

WORKDIR /app

COPY target/product.jar ./product.jar

EXPOSE 8082

CMD ["java", "-jar", "product.jar"]