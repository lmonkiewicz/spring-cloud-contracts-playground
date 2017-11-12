package com.lmonkiewicz.contracts.server.base;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.lmonkiewicz.contracts.server.PostsController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;

@Slf4j
public class AppPostsBase {

    @Before
    public void setUp() throws Exception {
        log.info("SETUP launched");
        RestAssuredMockMvc.standaloneSetup(new PostsController());
    }
}


