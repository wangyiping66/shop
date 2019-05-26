FROM java:8
ADD shop-user-server.jar /Users/wangping/wp/testForDocker/
WORKDIR /Users/wangping/wp/testForDocker
EXPOSE 9081
ENTRYPOINT ["java","-jar","-Xms250m","-Xmx500m","-Duser.timezone=GMT+08","shop-user-server.jar"]