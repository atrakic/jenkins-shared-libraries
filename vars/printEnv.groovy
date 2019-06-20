def call() {
  echo "Branch Name     : ${env.BRANCH_NAME}"
  echo "BUILD_NUMBER    : ${env.BUILD_NUMBER}"
  echo "BUILD_ID        : ${env.BUILD_ID}"
  echo "JOB_NAME        : ${env.JOB_NAME}"
  echo "BUILD_TAG       : ${env.BUILD_TAG}"
  echo "EXECUTOR_NUMBER : ${env.EXECUTOR_NUMBER}"
  echo "NODE_NAME       : ${env.NODE_NAME}"
  echo "NODE_LABELS     : ${env.NODE_LABELS}"
  echo "WORKSPACE       : ${env.WORKSPACE}"
  echo "JENKINS_HOME    : ${env.JENKINS_HOME}"
}
