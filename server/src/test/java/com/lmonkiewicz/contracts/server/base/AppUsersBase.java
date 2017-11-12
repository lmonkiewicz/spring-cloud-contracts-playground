package com.lmonkiewicz.contracts.server.base;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.lmonkiewicz.contracts.server.Message;
import com.lmonkiewicz.contracts.server.UsersController;
import com.lmonkiewicz.contracts.server.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Slf4j
public class AppUsersBase {

    @Before
    public void setUp() throws Exception {
        log.info("SETUP launched");

        UsersService service = mock(UsersService.class);
        when(service.login(eq("Stefan"))).thenReturn(Message.builder().message("Hello Stefan").build());

        RestAssuredMockMvc.standaloneSetup(new UsersController(service));
    }
}


