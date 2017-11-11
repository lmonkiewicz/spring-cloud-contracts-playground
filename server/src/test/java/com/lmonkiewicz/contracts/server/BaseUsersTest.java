package com.lmonkiewicz.contracts.server;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Slf4j
public class BaseUsersTest {

    @Before
    public void setUp() throws Exception {
        log.info("SETUP launched");

        UsersService service = mock(UsersService.class);
        when(service.login(eq("Stefan"))).thenReturn(Message.builder().message("Hello Stefan").build());

        RestAssuredMockMvc.standaloneSetup(new UsersController(service));
    }
}


