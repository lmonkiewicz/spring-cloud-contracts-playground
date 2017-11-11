package contracts.server.users

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        urlPath('/login') {
        }
    }
    response {
        status 400
    }
}