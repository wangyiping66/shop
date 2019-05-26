FROM java:8
ADD shop-eureka.jar /Users/wangping/wp/testForDocker/
WORKDIR /Users/wangping/wp/testForDocker
EXPOSE 9080
ENTRYPOINT ["java","-jar","-Xms250m","-Xmx500m","-Duser.timezone=GMT+08","shop-eureka.jar"]