def call(String project, String hubUser, String version = 'beta') {
    sh "docker image tag ${hubUser}/${project}:${version}-${env.BRANCH_NAME}-${env.BUILD_NUMBER} ${hubUser}/${project}:${env.BUILD_NUMBER}"
    sh "docker image push ${hubUser}/${project}:${env.BUILD_NUMBER}"
    sh "docker image tag ${hubUser}/${project}:${version}-${env.BRANCH_NAME}-${env.BUILD_NUMBER} ${hubUser}/${project}:latest"
    sh "docker image push ${hubUser}/${project}:latest"
}
