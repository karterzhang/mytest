#declarative-pipeline
pipeline {
    agent any

    stages {
        stage('Source') {
            steps {
                echo 'Hello World'
            }
        }
		
		stage('Build') {
            steps {
                echo 'Hello World'
            }
        }
		
		stage('Code_Security_Check') {
            steps {
                echo 'Hello World'
            }
        }
		
		stage('Deploy') {
            steps {
                echo 'Hello World'
            }
        }
		
		
    }
}
