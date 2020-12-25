node{
  stage('SCM Checkout'){
    git 'https://github.com/Aixoxs/JenkinsTest'
  }
  stage('Compile-Package'){
    //Get maven home path
    def mvnHome = tool name: 'maven-3', type: 'maven'
    bat "${mvnHome}/bin/mvn package"
  }
  stage('Deploy to Tomcat'){
    sshagent(['tomcat-dev']) {
      bat "scp -o StrictHostKeyChecking=no target/*.war root@192.168.0.101:/opt/tomcat/apache-tomcat-8.5.61/webapps"
    }
  }
}
