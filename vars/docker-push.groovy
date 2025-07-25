def call(String dockerHubUser ,String project,String imageTag){
    echo "This is pushing the image to Docker Hub"
    withCredentials([usernamePassword(
                    credentialsId: 'DockerHub',
                    usernameVariable: 'dockerHubUser',
                    passwordVariable: 'dockerHubPass'
                )]) {
    
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    
                }
  sh "docker push ${dockerHubUser}/${project}:${imageTag}
}
