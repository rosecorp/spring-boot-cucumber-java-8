package com.rosecorp.springbootcucumberjava8.services;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public String retrieve() {
        return "retrieved data from backed repository";
    }
}
