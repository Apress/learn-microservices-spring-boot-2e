FROM openjdk:14
COPY ./target/multiplication-0.0.1-SNAPSHOT.jar /usr/src/multiplication/
WORKDIR /usr/src/multiplication
EXPOSE 8080
CMD ["java", "-jar", "multiplication-0.0.1-SNAPSHOT.jar"]
