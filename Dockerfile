FROM amazoncorretto:11-alpine-jdk
MAINTAINER lvz
COPY target/lvz-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["jar","-jar","/app.jar"]

