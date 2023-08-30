# FROM bellsoft/liberica-openjdk-alpine

# COPY ./java ./src
# RUN mkdir ./out
# RUN javac -sourcepath ./src -d out src/lesson1/semple/Main.java
# CMD java -classpath ./out lesson1.semple.Main

FROM bellsoft/liberica-openjdk-alpine as BuildProject

WORKDIR /app
COPY ./java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out ./src/lesson1/semple/Main.java

FROM scratch as OutputFiles
COPY --from=BuildProject /app/out /bin