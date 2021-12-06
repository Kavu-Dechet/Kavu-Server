FROM openjdk:11
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar
ADD docker-wait-for-it.sh docker-wait-for-it.sh
RUN bash -c 'chmod +x /docker-wait-for-it.sh'

ENTRYPOINT ["/bin/bash", "/docker-wait-for-it.sh"]
# CMD "java -Djava.security.egd=file:/dev/./urandom -jar  /app.jar"

