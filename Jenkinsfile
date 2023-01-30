pipeline {
    agent any
    stages {
        stage ('Functional Test') {
            steps {
                dir('functional-test') {
                    git credentialsId: '1a9096f9-81f3-49cb-81ca-701ae19598dd', url: 'https://bitbucket.org/lyenes/desafio-qa-modulo4'
                    bat 'cd Desafio4'
                    bat 'mvn clean compile'
                    bat 'mvn test'
                }   
            }
        }
    }
}


