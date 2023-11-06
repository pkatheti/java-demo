
FROM openjdk:11-jre-slim
#VOLUME /tmp
ENV HOME=/usr/app
RUN mkdir -p ${HOME}

COPY target/JavaCrudApis-0.0.1-SNAPSHOT.jar ${HOME}/JavaCrudApis-0.0.1-SNAPSHOT.jar

ENTRYPOINT java -jar ${HOME}/JavaCrudApis-0.0.1-SNAPSHOT.jar
