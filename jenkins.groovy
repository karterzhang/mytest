pipeline {
    agent any

    stages {
        stage('Source') {
            steps {
                echo 'Hello World-Source'
		sh 'hostname'
                sh 'date'
            }
        }
		
		stage('Build') {
            steps {
                echo 'Hello World-Build';pwd
            }
        }
		
		stage('Code_Security_Check') {
            steps {
                echo 'Hello World-Code_Security_Check';date
            }
        }
		
		stage('Deploy') {
            steps {
                echo 'Hello World-Deploy';id
            }
        }
		
		
    }
}
