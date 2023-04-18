FROM amazoncorretto:11-alpine-jdk
MAINTAINER lvz
COPY target/lvz-0.0.1-SNAPSHOT.jar lvz-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/lvz-0.0.1-SNAPSHOT.jar"]