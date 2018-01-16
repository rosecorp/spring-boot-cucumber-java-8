package com.rosecorp.springbootcucumberjava8;

import com.rosecorp.springbootcucumberjava8.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ApplicationController {

    @Autowired
    AppService appService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String index() {
        return appService.retrieve();

    }
}
