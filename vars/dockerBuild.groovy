def call(String project, String hubUser, String version = 'beta') {
    sh "docker image build -t ${hubUser}/${project}:${version}-${env.BRANCH_NAME}-${env.BUILD_NUMBER} ."

    dockerLogin()

    sh "docker image push ${hubUser}/${project}:${version}-${env.BRANCH_NAME}-${env.BUILD_NUMBER}"
}
