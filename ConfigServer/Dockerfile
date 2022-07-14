## docker run --name egov-config -d -p 8888:8888 -e profile=prod -e ENCRYPT_KEY=??? egovframework/egov-config
## base image - openjdk8
#FROM openjdk:8-jre-alpine
#
## curl(healthcheck)
#RUN apk --no-cache add curl
## directory 생성
#RUN mkdir -p /usr/app/config
## jar 파일이 복사되는 위치
#ENV APP_HOME=/usr/app/
## 작업 시작 위치
#WORKDIR $APP_HOME
## jar 파일 복사
#COPY build/libs/*.jar config.jar
## application port
#EXPOSE 8888
## 실행
#CMD ["java", "-Dsearch.location=/usr/app/config", "-jar", "config.jar"]

FROM openjdk:8-jre-alpine

RUN mkdir -p /usr/app/config

ENV APP_HOME=/usr/app

WORKDIR $APP_HOME

#COPY target/ConfigServer-0.0.1-SNAPSHOT.jar config.jar
#COPY target/ConfigServer-*.jar config.jar
COPY target/*.jar config.jar

EXPOSE 8888

CMD ["java", "-jar", "config.jar"]


#Dockerfile 정의로 image로 만들고 docker or docker-compose 를 사용해서 container에 배포한다.

#docker build 명령어(Dockerfile 사용한 빌드)
#docker build -t egovframe/msa-edu-config:latest .

#container 실행
# - docker
# - docker compose

#docker run 명령어
#docker run -d -p 8888:8888 -v C:\IdeaProjects\msa_netflix_v1.0.1\ConfigServer\src\main\resources\configuration-repository:/usr/app/config --name config egovframe/msa-edu-config:latest