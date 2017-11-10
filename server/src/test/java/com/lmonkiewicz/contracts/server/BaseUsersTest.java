package com.lmonkiewicz.contracts.server;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;

@Slf4j
public class BaseUsersTest {

    @Before
    public void setUp() throws Exception {
        log.info("SETUP launched");
//        RestAssuredMockMvc.standaloneSetup(new GreetingController());
    }
}


