FROM java:8
MAINTAINER Cashpoc
COPY gateway-service.jar /opt/lib/
ENTRYPOINT ["java"]
CMD ["-Dspring.profiles.active=docker","-jar", "/opt/lib/gateway-service.jar"]
EXPOSE 8765:8765