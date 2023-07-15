
def call(String branch, String url) {
    scmGit(
        branches: [[name: branch]], 
        extensions: [], 
        userRemoteConfigs: [[url: url]]
    )
}

