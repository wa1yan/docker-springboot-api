FROM tomcat:9.0.70-jdk8-temurin-jammy
COPY target/docker-test-api-1.0.war /usr/local/tomcat/webapps/docker-test-api-1.0.war
ENTRYPOINT [ "sh", "-c", "java -jar /usr/local/tomcat/webapps/docker-test-api-1.0.war" ]
