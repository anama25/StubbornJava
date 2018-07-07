pipeline {
  agent any
  stages {
    stage('Test / Build') {
      steps {
        sh './gradlew build --no-daemon'
      }
    }
    stage('Build Docker Container') {
      steps {
        sh 'aws ecr get-login --no-include-email --region us-east-1'
        sh 'docker build -t master -f - stubbornjava-webapp/build/docker/ < stubbornjava-webapp/docker/app/Dockerfile'
        sh 'docker tag stubborn-java-containers:master 806747561449.dkr.ecr.us-east-1.amazonaws.com/stubborn-java-containers:master'
        sh 'docker push 806747561449.dkr.ecr.us-east-1.amazonaws.com/stubborn-java-containers:master'
      }
    }
  }
  post {
    always {
      junit '**/build/test-results/**/*.xml'
    }
  }
}
