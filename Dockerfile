FROM ubuntu
RUN apt-get update
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
COPY configuration /usr/local/service/configuration
WORKDIR /usr/local/service/
CMD mvn clean install "-Dcheckstyle.skip"