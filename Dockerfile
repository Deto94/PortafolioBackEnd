FROM amazoncorretto:11-alpine-jdk
MAINTAINER Deto
COPY target/Deto-0.0.1-SNAPSHOT.jar deto-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/deto-app.jar"]
