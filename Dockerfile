FROM openjdk:17
EXPOSE 8080
ADD target/my-springboot-images.jar my-springboot-images.jar
ENTRYPOINT ["java","jar","/my-springboot-images.jar"]