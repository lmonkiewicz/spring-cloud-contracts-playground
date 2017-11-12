package contracts.app.posts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        urlPath('/list') {
        }
    }
    response {
        status 200
        body('''
            [
                "First","Second","Third","Fourth"
            ]
        ''')
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
}