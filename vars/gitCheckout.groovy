
def call(String branch, String repourl) {
    scmGit(
        branches: [[name: branch]], 
        extensions: [], 
        userRemoteConfigs: [[url: url]]
    )
}

call('main','https://github.com/nalajala9/maven-web.git')