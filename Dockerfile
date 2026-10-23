FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java","-cp","app.jar","com.hutingyu.App"]
