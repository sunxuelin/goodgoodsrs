FROM java:8
VOLUME /tmp
ADD *.jar app.jar
EXPOSE 9876
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]