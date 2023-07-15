
def call(String branch, String repourl) {
    scmGit(
        branches: [[name: branch]], 
        extensions: [], 
        userRemoteConfigs: [[url: url]]
    )
}

