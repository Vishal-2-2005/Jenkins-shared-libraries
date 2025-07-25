def call(String imageName,String Dockerhubuser,String imagetag ){
  sh "docker build -t "${Dockerhubuser}"/"${imageName}":"${imagetag}"
}
