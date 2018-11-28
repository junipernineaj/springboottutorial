pipeline {
    agent any
    stages { 
        stage('Clone and Clean') {
            steps {
                echo 'Cloning and Cleaning'
        	      sh "/usr/local/bin/mvn clean"
            }
        }    
        stage('Test') {
            steps {
                echo 'Testing'
        	      sh "/usr/local/bin/mvn test"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
        	      sh "/usr/local/bin/mvn package"
            }      
        }   
    }
}
