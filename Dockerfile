FROM openjdk:17-jdk-alpine
MAINTAINER baeldung.com
COPY ./target/dockerJavaDemo-0.0.1-SNAPSHOT.jar message-server-1.0.0.jar
WORKDIR /
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]