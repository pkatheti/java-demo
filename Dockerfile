
FROM openjdk:11-jre-slim
#VOLUME /tmp
ENV HOME=/usr/app
RUN mkdir -p ${HOME}
EXPOSE 8080

COPY target/JavaCrudApis-0.0.1-SNAPSHOT.jar ${HOME}/JavaCrudApis-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java -jar ${HOME}/JavaCrudApis-0.0.1-SNAPSHOT.jar"]
## Use an official OpenJDK 11 image as the base image
#FROM openjdk:11-jre-slim
#
## Set the working directory in the container
#
#
##
## Build stage
##
##FROM openjdk:11-jre-slim AS build
#ENV HOME=/usr/app
#RUN mkdir -p HOME
#WORKDIR $HOME
#ADD . $HOME
#RUN --mount=type=cache,target=/root/.m2 ./mvnw -f $HOME/pom.xml clean package
#
##
## Package stage
##
#FROM openjdk:11-jre-slim
#ARG JAR_FILE=/usr/app/target/*.jar
#COPY --from=build $JAR_FILE /app/runner.jar
#EXPOSE 8080
#ENTRYPOINT java -jar /app/runner.jar
