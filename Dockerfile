FROM ubuntu:16.04
FROM openjdk:8-jre-alpine
COPY target/streams-java-1.0-SNAPSHOT.jar /streams-java.jar
ENTRYPOINT exec java $* -jar /assignment-day-one-1.0-SNAPSHOT.jar
