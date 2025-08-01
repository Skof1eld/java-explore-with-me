FROM amazoncorretto:21-alpine
COPY target/service-0.0.1-SNAPSHOT.jar ewm-service.jar
ENTRYPOINT ["java","-jar","/ewm-service.jar"]