FROM amazoncorretto:17 AS BUILD

WORKDIR /opt

ENV MAVEN_VERSION=3.9.11
ENV MAVEN_HOME=/opt/apache-maven-${MAVEN_VERSION}
ENV MAVEN_BIN=$MAVEN_HOME/bin

RUN yum install tar wget gzip -y

RUN wget https://dlcdn.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz
RUN tar xvf apache-maven-${MAVEN_VERSION}-bin.tar.gz

ENV PATH=${MAVEN_BIN}:$PATH
COPY . .

RUN mvn clean package

FROM amazoncorretto:17

WORKDIR /app

COPY --from=BUILD /opt/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]