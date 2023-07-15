
def call(String branch, String url) {
    checkout([$class: 'GitSCM',
              branches: [[name: branch]],
              extensions: [],
              userRemoteConfigs: [[url: url]]
    ])
}


