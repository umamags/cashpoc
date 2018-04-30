FROM java:8
MAINTAINER Cashpoc
COPY kafka-sender-0.0.1-SNAPSHOT.jar /opt/lib/kafkasender.jar
ENTRYPOINT ["java"]
CMD ["-Dspring.profiles.active=docker","-jar", "/opt/lib/kafkasender.jar"]
EXPOSE 4444:4444