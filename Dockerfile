FROM openjdk:15-alpine AS build
COPY src home/viktorsidiak/IdeaProjects/Credit/src
COPY pom.xml home/viktorsidiak/IdeaProjects/IntecaProject/Credit

FROM openjdk:15-alpine
COPY target/docker-credit.jar docker-credit.jar
ENTRYPOINT ["java", "-jar", "docker-credit.jar"]