# ElevateLabs-task-2

This project implements a complete pipeline for a Spring Boot application using Jenkins. The pipeline automates entire process from code checkout to build and push Docker image. 

Pipeline Flow
This pipeline is defined in the Jenkinsfile and stages:

>>>Checkout SCM: Clones the source code from the Git repository.

>>>Build Application: Compiles the Spring Boot application using Mave

>>>Run Tests: Test the application

>>>Build Docker Image: Uses the Dockerfile in the repository to build a new Docker image containing the packaged Spring Boot application.

>>>Push to Docker Hub: Pushes the newly built image to Docker Hub.

for Trigger
The pipeline is configured to trigger automatically using a webhook for every git push event to the main repository.

