#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

# Add the application's jar to the container
COPY target/hngx-stage-one-0.0.1-SNAPSHOT.jar hngx-stage-one-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/hngx-stage-one-0.0.1-SNAPSHOT.jar"]