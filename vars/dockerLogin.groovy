def call(String id = 'dockerHUB') {
    withCredentials([usernamePassword(
            credentialsId: "${id}",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u $USER -p $PASS"
    }
}
