pipeline {
    agent any

    stages {
	    
	stage('Example') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
                submitter "alice,bob"
                parameters {
                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                }
                  }
            steps {
                echo "Hello, ${PERSON}, nice to meet you."
            }
        }
     	    
        stage('Source') {
            steps {
                echo 'Hello World-Source'
		sh 'hostname'
                sh 'date'
            }
        }
		
		stage('Build') {
            steps {
                echo 'Hello World-Build'
                sh 'pwd;ls'
            }
        }
		
		stage('Code_Security_Check') {
            steps {
                echo 'Hello World-Code_Security_Check'
                sh 'free'
            }
        }
		
		stage('Deploy') {
            steps {
                echo 'Hello World-Deploy'
                sh '''
                  id
		  pwd
		  date		  
                '''
            }
        }
		
		
    }
}
