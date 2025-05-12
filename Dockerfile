FROM openjdk:17-jdk
EXPOSE 8080
ADD build/libs/example-h2-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]