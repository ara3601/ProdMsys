FROM openjdk:8
EXPOSE 8080
ADD target/demo-app.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]
