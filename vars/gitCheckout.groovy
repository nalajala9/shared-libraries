
def call(Map params) {
    def branch  = params.branch
    def url = params.url
    
    checkout([$class: 'GitSCM',
              branches: [[name: branch]],
              extensions: [],
              userRemoteConfigs: [[url: url]]
    ])
}


