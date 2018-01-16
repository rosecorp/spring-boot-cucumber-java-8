package com.rosecorp.springbootcucumberjava8.cucumber;

import com.rosecorp.springbootcucumberjava8.SpringBootCucumberJava8Application;
import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest(classes = SpringBootCucumberJava8Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("INTEGRATION_TEST")
@ContextConfiguration
public class CucumberRoot implements En {

    @Autowired
    protected TestRestTemplate template;

}
