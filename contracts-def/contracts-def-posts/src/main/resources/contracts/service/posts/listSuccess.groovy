package contracts.service.posts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        urlPath('/list') {
        }
    }
    response {
        status 200
        body('''
            {
                "message": "Its a list"
            }
        ''')
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
}