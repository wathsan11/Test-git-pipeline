pipeline {
    agent any

    stages {
        stage('Print Hello World') {
            steps {
                echo 'Hello, World!'
            }
        }
        stage('Create environment') {
            steps {
              sh '''
                terraform init
                terraform plan
                terraform apply
                '''    
            }
        }
        stage('Configure environment') {
            steps {
              sh '''
                ansible-playbook -i inventory.ini playbook.yml
                '''    
            }
        }
        
        stage('Run application') {
            steps {
                checkout scm
                sh 'python3 hello_world.py'
            }
        }
    }
}
