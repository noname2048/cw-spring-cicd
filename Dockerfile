FROM gradle:8.2.1-jdk17
WORKDIR /app
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar /app/app.jar
CMD java -jar app.jar
