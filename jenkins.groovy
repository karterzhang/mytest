pipeline {
    agent any

    parameters {
        string(name: 'code_branch', defaultValue: 'master', description: '请输入将要构建的代码分支')
        choice(name: 'mode', choices: ['deploy', 'rollback'], description: '选择方向！')
        text(name: 'deploy_info', defaultValue: 'test', description: 'Enter some information about this deploy')
        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
     }


    stages {	    
        stage('Input') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
                parameters {
                    string(name: 'Approver', defaultValue: 'Karter', description: 'Who will approve this job?')
                }              
            } 
	   
	    steps {
          	  echo "Hello, ${Approver}, thans for your help!"
            }
        }
     	
	    
	stage('parameters') {
            steps {
                echo "Hello, ${code_branch} branch will ${mode}"
                echo "About this deploy: ${deploy_info}"
                echo "Password: ${params.PASSWORD}"
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
