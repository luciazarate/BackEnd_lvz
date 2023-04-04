FROM amazoncorretto:8-alpine-jdk
MAINTAINER veronicazarate
COPY target/lvz-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]