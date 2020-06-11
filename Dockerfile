FROM openjdk:8
ADD target/product-service.jar product-service.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","product-service.jar"]