node {
      stage("build") {
            sh 'mvn clean package sonar:sonar'
        }
      stage("SonarQube") {
            sh 'mvn sonar:sonar -Dsonar.host.url=http://raspberrysqlserver.ddns.net:9000 -Dsonar.login=28c58cbab36a616d8eb8277f53e30d81ada7c35e'
      }

}