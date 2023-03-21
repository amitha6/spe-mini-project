
pipeline {
    // environment{
    //     imageName = ""
    // }
    agent any

    stages {
        stage('Git Pull stage') {
            steps {
                // Get some code from a GitHub repository
                git url:'https://github.com/amitha6/spe-mini-project',
                    branch:"main"
            }
        }
        stage('Maven Build'){
            steps{
                script{
                    sh 'mvn clean install'
                    
                } 
            }
        }
        stage('Docker Build Image')
        {
            steps{
                script{
                    imageName = docker.build "amitha1234/scientific_calculator"
                }
            }
        }
        stage('Push Docker Image')
        {
            steps{
                script{
                    docker.withRegistry("", 'docker_cred' ){
                        imageName.push()
                    }
                }
            }
        }
        stage('Ansible deployment')
        {
            steps{

                // sh "ansible-playbook log4j2.yml -i inventory"
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }
    }
}