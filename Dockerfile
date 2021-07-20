FROM openjdk:8-jre-alpine
ENV APP_FILE pipeline-test-for-java-0.0.1-SNAPSHOT.jar
ENV APP_HOME /usr/apps
EXPOSE 9090
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0 -jar $APP_FILE"]
