FROM openjdk:8u171-jdk-alpine3.7
COPY libs libs
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -cp :libs/* com.stubbornjava.webapp.StubbornJavaWebApp"]
