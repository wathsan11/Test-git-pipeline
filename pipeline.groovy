pipeline {
    agent any

    stages {
        stage('Print Hello World') {
            steps {
                echo 'Hello, World!'
            }

        stage('run hello_world.py'){
            sh 'python3 hello_world.py'
        }
            
        
        }
    }
}
