def call(String project) {
    sh "docker system prune -f"
}
