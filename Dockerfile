FROM maven:3.8.6-openjdk-11 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean test

CMD ["mvn", "test"]

