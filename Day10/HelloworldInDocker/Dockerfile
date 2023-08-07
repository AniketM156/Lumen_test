FROM openjdk:8

# WORKDIR C:\Users\e019972\eclipse-workspace\DockerPractise\src
WORKDIR /app

COPY . /app/

RUN javac Hello.java

ENTRYPOINT ["java","Hello"]