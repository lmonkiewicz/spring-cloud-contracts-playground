package contracts.server.users

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        urlPath('/login') {
            queryParameters {
                parameter('login', 'Stefan')
            }
        }
    }
    response {
        status 200
        body('''
            {
                "message": "Hello user"
            }
        ''')
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
}