FROM openjdk:11.0.3-jdk-stretch
ADD ./target/music-service-0.0.1-SNAPSHOT.jar /app/muzix/music-service-0.0.1-SNAPSHOT.jar
WORKDIR app/muzix
ENTRYPOINT ["java","-jar","music-service-0.0.1-SNAPSHOT.jar"]