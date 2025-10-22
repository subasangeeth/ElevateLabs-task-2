pipeline {
agent any

environment {
    DOCKER_CREDENTIALS = credentials('docker-creds') // Docker credentials ID
}

stages {
    stage('Checkout Code') {
        steps {
              git branch: 'main', url: 'https://github.com/subasangeeth/ElevateLabs-task-2.git'
            
        }
    }

    stage('Build') {
        steps {
            dir('springapp-jenkins') {
                sh 'mvn clean install -DskipTests'
            }
        }
    }

    stage('Test') {
        steps {
            dir('springapp-jenkins') {
                
                sh 'mvn spring-boot:start'
                sh 'mvn test'
                sh 'mvn spring-boot:stop'
            }
        }
    }

    stage('Docker Build') {
        steps {
             dir('springapp-jenkins') {
     
              sh 'docker build -t subasangeeth/springapp:latest .'
              sh 'echo $DOCKER_CREDENTIALS_PSW | docker login -u $DOCKER_CREDENTIALS_USR --password-stdin'
             }
        }
    }

    stage('Push to Docker Hub') {
        steps {
                   
                    sh 'docker push subasangeeth/springapp:latest'
                    sh 'docker run -p 8090:8090 -d  subasangeeth/springapp:latest'
               
        }
    }
}
}
