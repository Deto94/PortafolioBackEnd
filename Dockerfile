FROM amazoncorretto:11-alpide-jdk
MAINTAINER Deto
COPY target/Deto-0.0.1-SNAPSHOT.jar deto-app.jar
ENTRYPOINT ["java","-jar","/deto-app.jar"]
