pipeline {
    agent {
        // run with the custom python slave
        // will dynamically provision a new pod on APPUiO
        label 'nodejs_docker'
    }
    stages {
        stage('Build') {
            steps {
                echo "Build"
                sh "docker images"
                //echo "my name: $MYNAME"
            }
        }
        stage('Test') {
            steps {
                echo "Test"
                sleep 2
            }
        }
        stage('DeployDev') {
            steps {
                echo "Deploy to Dev"
                sleep 5
            }
        }
        stage('PromoteTest') {
            steps {
                echo "Deploy to Test"
                sleep 5
            }
        }
        stage('PromoteProd') {
            steps {
                echo "Deploy to Prod"
                sleep 5
            }
        }
    }
}
