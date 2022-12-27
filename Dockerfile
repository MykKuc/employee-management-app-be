FROM openjdk:17-alpine
COPY build/libs/employee-management-app-0.0.1-TESTTEST.jar employee-management-app-0.0.1-TESTTEST.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/employee-management-app-0.0.1-TESTTEST.jar"]