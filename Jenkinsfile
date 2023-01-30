pipeline {
    agent any
    stages {
        stage ('Functional Test') {
            steps {
                git credentialsId: '1a9096f9-81f3-49cb-81ca-701ae19598dd', url: 'https://bitbucket.org/lyenes/desafio-qa-modulo4'
                dir ('Desafio4') {
                    bat 'mvn clean compile'
                    bat 'mvn test'
                }
            }
        }
    }
}


