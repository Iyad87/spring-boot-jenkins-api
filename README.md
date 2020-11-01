# spring-boot-jenkins-api

# Overview
An example project to demonstrate:

create a Spring Boot REST API
run Spring Boot in Docker and publish to Docker Hub 
deploy the Spring Boot application to AWS with CloudFormation


# Pre-requisites
JDK 11+
Docker
Building
Testing
./gradlew test

 # Building (no tests)
./gradlew assemble

# Building (with tests)
./gradlew build

# Running in Docker
./gradlew assemble docker dockerRun

# Stopping Docker container
./gradlew dockerStop

# Deploying to AWS
./gradlew awsCfnMigrateStack awsCfnWaitStackComplete -PsubnetId=<your-subnet-id> -Pregion=<your-region>

# Deleting AWS deployment
./gradlew awsCfnDeleteStack awsCfnWaitStackComplete

# Using API
get all students  - GET /students to get a list of all the students
get specific students - GET /students/${id} to get a specific students
create students - POST JSON to /students to create a new students 
