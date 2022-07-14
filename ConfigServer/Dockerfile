## base image - openjdk8
FROM openjdk:8-jre-alpine
# directory 생성
RUN mkdir -p /usr/app/config  # -p (필요한 경우 상위 경로까지 생성한다)
# jar 파일이 복사되는 위치
ENV APP_HOME=/usr/app
# 작업 시작 위치
WORKDIR $APP_HOME

# jar 파일 복사
#COPY target/ConfigServer-0.0.1-SNAPSHOT.jar config.jar
#COPY target/ConfigServer-*.jar config.jar
COPY target/*.jar config.jar
# 외부노출 포트
EXPOSE 8888
# 실행
CMD ["java", "-jar", "config.jar"]


#Dockerfile 정의로 image로 만들고 docker or docker-compose 를 사용해서 container에 배포한다.

#docker build 명령어(Dockerfile 사용한 빌드[이미지생성])
#docker build -t egovframe/msa-edu-config:latest .

#container 실행방법 2가지
# - docker
#docker run 명령어
#docker run -d -p 8888:8888 -v C:\IdeaProjects\msa_netflix_v1.0.1\ConfigServer\src\main\resources\configuration-repository:/usr/app/config --name config egovframe/msa-edu-config:latest

# - docker-compose
#msa_netfilx_v1.0.1/docker-compose/app/ 이동
#docker-compose up -d (백그라운드로 실행하는 옵션)

