package contracts.server.users

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        urlPath('/login') {
            queryParameters {
                parameter('name', 'Stefan')
            }
        }
    }
    response {
        status 200
        body('''
            {
                "message": "Hello Stefan"
            }
        ''')
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
}