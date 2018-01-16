package com.rosecorp.springbootcucumberjava8.cucumber.steps;

import com.rosecorp.springbootcucumberjava8.config.ConfigBean;
import com.rosecorp.springbootcucumberjava8.cucumber.CucumberRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AppStepDef extends CucumberRoot {

    @Autowired
    private ConfigBean configBean;

    private ResponseEntity<String> response;

    public AppStepDef() {
        When("^the client calls app$", () -> {
            response = template.getForEntity("/app", String.class);
        });

        When("^the client receives response status code of (\\d+)$", (Integer statusCode) -> {
            HttpStatus currentStatusCode = response.getStatusCode();
            assertThat("status code is correct : " +
                    response.getBody(), currentStatusCode.value(), is(statusCode));
        });

        And("^config data is correct$", () -> {
            assertThat(configBean.getConfigData(), is("config data"));
        });
    }

}
