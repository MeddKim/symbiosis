FROM noah/oraclejdk:latest
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ['java',"-Denv=dev","-jar","/app.jar"]
