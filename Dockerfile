FROM frolvlad/alpine-oraclejdk8:slim
WORKDIR /usr/share/webrobot-config-service
ADD target/webrobot-config-service.jar webrobot-config-service.jar
RUN touch webrobot-config-service.jar
EXPOSE 3001
ENTRYPOINT ["/usr/bin/java", "-jar", "webrobot-config-service.jar"]
