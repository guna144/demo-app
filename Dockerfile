FROM openjdk:8
EXPOSE 8080
ADD target/springboot-demo-app-image.jar springboot-demo-app-image.jar
ENTRYPOINT ["java","-jar","/springboot-demo-app-image.jar"]