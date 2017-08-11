properties([
    buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '10')),
    parameters([string(defaultValue: '', description: '''A specific commit ID can be provided to build older releases. If no ID is entered then the latest commit (HEAD) is used.''', name: 'COMMIT_ID')])//,
    pipelineTriggers([pollSCM('H/15 * * * *')])
  ])
node {
  withEnv([]) {
    try {
      stage('checkout') {
        echo 'Checkout...'
        checkout scm
        sh 'git rev-parse HEAD'
        sh 'ls'
      }
      stage('prepare-env') {
        sh './build/org.eclipse.app4mc.build/hudson/init_mylyn.sh'
        //sh './build/org.eclipse.app4mc.build/setup_env.sh'
      }
      stage('build') {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: false]) {
          dir('build/org.eclipse.app4mc.build/') {
            withMaven(jdk: 'jdk1.8.0-latest', maven: 'apache-maven-latest') {
              sh 'mvn clean verify'
            }
          }
        }
      }
      stage('post-build') {
        archiveTarget()
        junit '**/surefire-reports/TEST*.xml'
      }
    } catch (e) {
      currentBuild.result = "FAILED"
      // try to archive build product in error case
      emailext body: '''<p>FAILED: Job \'${env.JOB_NAME} [${env.BUILD_NUMBER}]\':</p>
      <p>Check console output at &QUOT;<a href=\'${env.BUILD_URL}\'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>''', recipientProviders: [[$class: 'RequesterRecipientProvider'], [$class: 'FirstFailingBuildSuspectsRecipientProvider']], subject: 'FAILED: Job \'${env.JOB_NAME} [${env.BUILD_NUMBER}]\''
      archiveTarget()
      throw e
    }
  }
}

def archiveTarget () {
  archiveArtifacts 'build/org.eclipse.app4mc.platform.product/target/'
}

