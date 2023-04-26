FROM amazoncorretto:11-alpine-jdk
MAINTAINER Deto
COPY target/Deto-0.0.1-SNAPSHOT.jar Deto-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Deto-0.0.1-SNAPSHOT.jar"]
