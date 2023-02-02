pipeline {
    agent any

    stages {
	stage('PreBuild') {
            steps {
		input {
                   message "please input your name"
                   ok "Yes, we should."
		   parameters {
                    string(name: 'PERSON', defaultValue: 'Jenkins', description: 'Who should I say hello to?')
                         }	
                     }
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
