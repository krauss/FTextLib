FROM openjdk:14-jdk
RUN mkdir -p /home/ftextlib/src
COPY ./src /home/ftextlib/src 
WORKDIR /home/ftextlib
RUN javac -d bin -cp src src/org/krauss/ftextlib/main/MainConsole.java
RUN chmod +x -R bin/
CMD ["java", "-cp", "bin", "org.krauss.ftextlib.main.MainConsole"] 