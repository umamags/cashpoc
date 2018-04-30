FROM java:8
MAINTAINER Cashpoc
COPY TzCashServices-1.0.jar /opt/lib/TzCashServices.jar
ENTRYPOINT ["java"]
CMD ["-Dspring.profiles.active=docker", "-jar", "/opt/lib/TzCashServices.jar"]
EXPOSE 2222:2222